package com.greenfox.rest.controller;

import com.greenfox.rest.model.Doubling;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class RESTController {

    @Autowired
    Doubling doubling;

    @GetMapping("/doubling{input}")
    public Doubling Double(@RequestParam(value="input") int input){
        doubling.setReceived(input);
        return doubling;
    }

    
}
