package com.example.greenfox.programmerfoxclub.model;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

@Component
public class Tricks {

    List<String> tricks = new ArrayList<>(Arrays.asList("Catch a goose",
                                                        "Insult man",
                                                        "Revive Tamagochi"));

    public Tricks(){

    }

    public void addTrick(String trick) {
        tricks.add(trick);
    }

    public List<String> getTricks() {
        return tricks;
    }
}
