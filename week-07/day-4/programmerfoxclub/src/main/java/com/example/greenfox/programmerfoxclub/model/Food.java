package com.example.greenfox.programmerfoxclub.model;

public enum Food {

    HAMBURGER("Hamburger") ,CHIPS ("Chips") , BREAD("Jam Sandwich") , PIZZA ("Pizza");

    String text;

    Food(String text){
        this.text = text;
    }

    @Override
    public String toString(){
        return text;
    }
}
