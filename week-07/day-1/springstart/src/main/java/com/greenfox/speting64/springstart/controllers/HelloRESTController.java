package com.greenfox.speting64.springstart.controllers;

import com.greenfox.speting64.springstart.SpringstartApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class HelloRESTController {

    AtomicLong counter = new AtomicLong(1);
    @RequestMapping(value = "/greeting")
    @ResponseBody
    public Greeting greeting(@RequestParam(value = "Viktor") String name){

        return new Greeting(counter.getAndIncrement(),"Hello " + name);
    }

/*    public static void main(String[] args) {
        SpringApplication.run(SpringstartApplication.class, args);
    }*/
}
