package com.greenfox.rest.model;

import org.springframework.stereotype.Component;

@Component
public class Greeter {

    String name;
    String title;
    String welcome_message;

    public Greeter() {

    }

    public Greeter(String name, String title) {
        this.name = name;
        this.title = title;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getWelcome_message() {
        this.welcome_message = "Oh, hi there " + name +", my dear "+  title +  "!";
        return welcome_message;
    }
}
