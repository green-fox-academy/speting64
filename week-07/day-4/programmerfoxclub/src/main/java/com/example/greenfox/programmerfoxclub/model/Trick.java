package com.example.greenfox.programmerfoxclub.model;

import java.util.List;

public enum Trick {

    PLAY ("Play LOL"), CODE ("Code in Java") , MATH ("Do ALgebra"), RUN (" Run the NYC Marathon");


    String textTrick;

    Trick(String textTrick){
        this.textTrick = textTrick;
    }

    @Override
    public String toString(){
        return textTrick;
    }

}
