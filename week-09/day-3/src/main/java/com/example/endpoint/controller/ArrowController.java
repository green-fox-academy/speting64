package com.example.endpoint.controller;

import com.example.endpoint.model.Arrow;
import com.example.endpoint.model.ErrorMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ArrowController {

    @Autowired
    Arrow arrow;

    @Autowired
    ErrorMessage errorMessage;

    @RequestMapping(value="/yondu" , method = RequestMethod.GET)
    public Arrow arrowSpeed(@RequestParam(value="distance") double distance, @RequestParam(value="time") double time){
        arrow.setDistance(distance);
        arrow.setTime(time);
        return arrow;
    }

}
