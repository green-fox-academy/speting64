package com.example.endpoint.controller;

import com.example.endpoint.model.Arrow;
import com.example.endpoint.model.ErrorMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.*;

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

    @ExceptionHandler(Exception.class)
    public ErrorMessage arrowError(MissingServletRequestParameterException e){
        String parameterName = e.getParameterName();
        errorMessage.setError("No parameters, Yondu's arrow sleeps in his slot");
        return errorMessage;
    }

}
