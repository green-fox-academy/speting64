package com.greenfox.rest.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Until {

    public int getUntil() {
        return until;
    }

    int until;

    public Until(){

    }

    public Until(int until){
        this.until=until;
    }
}
