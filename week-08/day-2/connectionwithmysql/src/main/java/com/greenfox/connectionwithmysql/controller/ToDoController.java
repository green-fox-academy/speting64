package com.greenfox.connectionwithmysql.controller;

import com.greenfox.connectionwithmysql.repository.ToDoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

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
}
