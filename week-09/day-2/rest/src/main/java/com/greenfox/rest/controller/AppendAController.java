package com.greenfox.rest.controller;

import com.greenfox.rest.model.AppendA;
import com.greenfox.rest.model.ErrorMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.*;

@RestController
public class AppendAController {

    @Autowired
    AppendA appendA;

    @Autowired
    ErrorMessage errorMessage;

    @GetMapping("/appenda/{appendable}")
    public AppendA append(@PathVariable("appendable") String appendTo){
        appendA.setAppended(appendTo);
        return appendA;
    }
}
