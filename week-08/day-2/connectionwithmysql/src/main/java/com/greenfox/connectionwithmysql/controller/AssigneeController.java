package com.greenfox.connectionwithmysql.controller;

import com.greenfox.connectionwithmysql.model.Assignee;
import com.greenfox.connectionwithmysql.repository.AssigneeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/assignees")
public class AssigneeController {

    long id;

    @Autowired
    AssigneeRepository assigneeRepository;

    @RequestMapping(value = {"/", ""})
    public String listAssignee(Model model) {
        model.addAttribute("assignee", assigneeRepository.findAll());
        return "assignees";
    }

    @GetMapping("/addassignee")
    public String add(Model model){
        model.addAttribute("newbie" , new Assignee());
        return "add";
    }

    @PostMapping("/addassignee")
    public String addAssignee(@ModelAttribute Assignee assignee){
        assigneeRepository.save(assignee);
        return "redirect:/assignees/";
    }

    @GetMapping("/{id}/delete")
    public String delete(@PathVariable long id,Model model) {
        Assignee assignee = assigneeRepository.findOne(id);
        model.addAttribute("assignee" , assignee);
        assigneeRepository.delete(id);
        return "redirect:/assignees";
    }

    @GetMapping("/{id}/edit")
    public String edit(Model model, @PathVariable("id") long id) {
        Assignee assignee = assigneeRepository.findOne(id);
        model.addAttribute("editing", assignee);
        return "edit";
    }

    @PostMapping("/{id}/edit")
    public String editInfo(@ModelAttribute Assignee assignee) {
        assigneeRepository.save(assignee);
        return "redirect:/assignees";
    }
}

