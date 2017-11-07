package com.greenfox.rest.controller;

import com.greenfox.rest.model.Doubling;
import com.greenfox.rest.model.Error;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class RESTController {

    @Autowired
    Doubling doubling;

    @Autowired
    Error error;

    @GetMapping("/doubling{input}")
    public Doubling Double(@RequestParam(value="input") int input){

        if(input <= 0){
            error.setError("Please provide a new input");
        }
        doubling.setReceived(input);

        return doubling;
    }

    @ExceptionHandler(Exception.class)
    public Error errorMessage(Exception e){
        error.setError("Please provide a new input");
        return error;
    }


}
