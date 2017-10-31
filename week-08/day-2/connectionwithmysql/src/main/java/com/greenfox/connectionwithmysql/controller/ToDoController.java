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

    @Autowired
    ToDoRepository todoRepository;

    @RequestMapping(value = {"/", "/list"})
    public String List(Model model){
        model.addAttribute("todolist",todoRepository.findAll());
        return "todo";
    }

    @GetMapping("/create")
    public String create(Model model){
        model.addAttribute("todo" , new ToDo());
        return "create";
    }

    @PostMapping("/add")
    public String addSubmit(@ModelAttribute ToDo todo){
        todoRepository.save(todo);
        return "redirect:/todo/list";
    }
}
