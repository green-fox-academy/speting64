package com.greenfox.rest.controller;

import com.greenfox.rest.model.Doubling;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class MainController {

    @RequestMapping("/")
    public String index(){
        return "index";
    }
}
