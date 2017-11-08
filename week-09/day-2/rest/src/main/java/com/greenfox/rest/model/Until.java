package com.greenfox.rest.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Until {

    public Integer getUntil() {
        return until;
    }

    Integer until;

    public Until(){

    }

    public Until(Integer until){
        this.until=until;
    }
}
