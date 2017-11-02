package com.greenfox.connectionwithmysql.controller;

import com.greenfox.connectionwithmysql.repository.ToDoRepository;
import com.greenfox.connectionwithmysql.model.ToDo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/todo")
public class ToDoController {

    long id;

    @Autowired
    ToDoRepository todoRepository;

    @RequestMapping(value = {"/", "/list"})
    public String List(Model model) {
        model.addAttribute("todolist", todoRepository.findAll());
        return "todo";
    }

    @GetMapping("/create")
    public String create(Model model) {
        model.addAttribute("todo", new ToDo());
        return "create";
    }

    @PostMapping("/add")
    public String addSubmit(@ModelAttribute ToDo todo) {
        todoRepository.save(todo);
        return "redirect:/todo/list";
    }

    @GetMapping("/{id}/delete")
    public String delete(@PathVariable long id) {
        todoRepository.delete(id);
        return "redirect:/todo/list";
    }

    @GetMapping("/{id}/edit")
    public String edit(Model model, @PathVariable("id") long id) {
        model.addAttribute("title", todoRepository.findOne(id).getTitle());
        model.addAttribute("urgent", todoRepository.findOne(id).isUrgent());
        model.addAttribute("done", todoRepository.findOne(id).isDone());
        this.id = id;
        return "update";
    }

    @PostMapping("/edit/update")
        public String update(@RequestParam("todo") String todo,
                            @RequestParam(name = "urgent", required = false) String isUrgent,
                            @RequestParam(name = "done", required = false) String isDone){
        ToDo save = todoRepository.findOne(id);
        if(!todo.equals("")){
            save.setTitle(todo);
        }
        save.setDone(Boolean.valueOf(isDone));
        save.setUrgent(Boolean.valueOf(isUrgent));
        todoRepository.save(save);
        return "redirect:/todo/list";

}





}
