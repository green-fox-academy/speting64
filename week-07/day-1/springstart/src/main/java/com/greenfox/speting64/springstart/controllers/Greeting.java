package com.greenfox.speting64.springstart.controllers;

//import lombok.AllArgsConstructor;
//import lombok.Getter;

//@Getter
//@AllArgsConstructor
public class Greeting {

    long id;
    String content;


    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public Greeting(long id, String content){
        this.id = id;
        this.content = content;

    }



}
