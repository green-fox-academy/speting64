package com.greenfox.speting64.springstart.controllers;

import com.greenfox.speting64.springstart.SpringstartApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRESTController {

    @RequestMapping(value = "/greeting")
    @ResponseBody
    public Greeting greeting(){
        Greeting greetings = new Greeting(1,"Hello World");
        return greetings;
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringstartApplication.class, args);
        //Greeting greetingz = new Greeting();
    }
}
