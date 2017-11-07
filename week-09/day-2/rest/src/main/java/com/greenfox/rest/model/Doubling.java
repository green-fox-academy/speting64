package com.greenfox.rest.model;

import org.springframework.stereotype.Component;

@Component
public class Doubling {

    private int received;
    int result;

    public Doubling(){

    }

    public Doubling(int received) {
        this.received = received;
    }

    public void setReceived(int received) {
        this.received = received;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public int getReceived() {
        return received;
    }

    public int getResult() {
        return received*2;
    }
}

