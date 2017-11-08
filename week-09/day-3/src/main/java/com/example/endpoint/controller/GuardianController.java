package com.example.endpoint.controller;

import com.example.endpoint.model.Guardian;
import com.example.endpoint.model.ErrorMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.*;

@RestController
public class GuardianController {

    @Autowired
    Guardian guardian;

    @Autowired
    ErrorMessage errorMessage;

    @RequestMapping(value="/groot" , method = RequestMethod.GET)
    public Guardian grootSpeech(@RequestParam(value= "message") String message){

        Guardian guardian = new Guardian();
        guardian.setRecieved(message);
        guardian.setTranslated("I am Groot!");
        return guardian;
    }

    @ExceptionHandler(Exception.class)
    public ErrorMessage grootError(MissingServletRequestParameterException e){
        String parameterName = e.getParameterName();
        errorMessage.setError("I am Groot");
        return errorMessage;
    }
}