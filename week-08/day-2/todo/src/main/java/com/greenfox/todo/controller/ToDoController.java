package com.greenfox.todo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.greenfox.todo.repository.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

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
