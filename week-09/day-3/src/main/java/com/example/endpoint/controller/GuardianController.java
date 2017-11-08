package com.example.endpoint.controller;

import com.example.endpoint.model.Guardian;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GuardianController {

    @Autowired
    Guardian guardian;

    @RequestMapping(value="/groot" , method = RequestMethod.GET)
    public Guardian grootSpeech(@RequestParam(value= "message") String message){

        Guardian guardian = new Guardian();
        guardian.setRecieved(message);
        guardian.setTranslated("I am Groot!");
        return guardian;
    }
}