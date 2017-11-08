package com.greenfox.rest.controller;

import com.greenfox.rest.model.Doubling;
import com.greenfox.rest.model.ErrorMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class DoubleController {

    @Autowired
    Doubling doubling;

    @Autowired
    ErrorMessage errorMessage;

    @GetMapping("/doubling{input}")
    public Doubling Double(@RequestParam(value="input") int input){
        ErrorMessage e = new ErrorMessage();

        if(input <= 0){
           e.setError("Please provide a new Input");
        }else{
            doubling.setReceived(input);
        }
        return doubling;
    }

    @ExceptionHandler(Exception.class)
    public ErrorMessage errorMessage(Exception e){
        errorMessage.setError("Please provide a new input");
        return errorMessage;
    }
}
