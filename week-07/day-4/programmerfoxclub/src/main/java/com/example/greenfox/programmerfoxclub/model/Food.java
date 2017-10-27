package com.example.greenfox.programmerfoxclub.model;

public enum Food {

    HAMBURGER("Hamburger") ,CHIPS ("Doritos") , BREAD("Jam Sandwich") , PIZZA ("Son-go-ku");

    String text;

    Food(String text){
        this.text = text;
    }

    @Override
    public String toString(){
        return text;
    }
}
