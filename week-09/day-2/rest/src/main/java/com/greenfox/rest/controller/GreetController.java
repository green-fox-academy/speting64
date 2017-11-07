package com.greenfox.rest.controller;

import com.greenfox.rest.model.Greeter;
import com.greenfox.rest.model.Error;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetController {

    @Autowired
    Greeter greeter;

    @Autowired
    Error error;

    @GetMapping("/greeter")
    public Greeter greeter(@RequestParam(value="name") String name , @RequestParam(value="title") String title ){
        greeter.setName(name);
        greeter.setTitle(title);
        return greeter;
    }


}
