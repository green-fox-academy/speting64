package com.example.greenfox.programmerfoxclub;

import org.springframework.stereotype.Component;

import java.util.List;
import java.util.ArrayList;

@Component
public class Fox {



    String name;
    String food;
    String drink;
    List<String> tricks;

    public Fox(){
        this.name = "Vuk";
        this.food = "Goose";
        this.drink = "Mud";
        this.tricks = new ArrayList<>();

    }

    public String getName() {
        return name;
    }

    public String getFood() {
        return food;
    }

    public String getDrink() {
        return drink;
    }

    public List<String> getTricks() {
        return tricks;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }

    public void addTrick(String trick) {
        tricks.add(trick);
    }
}
