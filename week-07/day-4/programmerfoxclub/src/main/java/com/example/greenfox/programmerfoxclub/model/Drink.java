package com.example.greenfox.programmerfoxclub.model;

public enum Drink {

    SOFTDRINK("Cola") ,WATER ("Water") , TEA("Tea") , Coffee ("Coffee");

    String textDrink;

    Drink(String textDrink){
        this.textDrink = textDrink;
    }

    @Override
    public String toString(){
        return textDrink;
    }
}
