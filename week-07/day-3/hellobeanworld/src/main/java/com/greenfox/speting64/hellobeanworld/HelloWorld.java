package com.greenfox.speting64.hellobeanworld;

import org.springframework.beans.factory.annotation.Autowired;

public class HelloWorld {
    private String message;

    @Autowired
    HelloWorld helloWorld;

    public void setMessage(String message){
        this.message  = message;
    }

    public String getMessage(){
        System.out.println("Your message: " + message);
        return message;
    }
}
