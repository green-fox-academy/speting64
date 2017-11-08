package com.example.endpoint.model;

import org.springframework.stereotype.Service;

@Service
public class Guardian {

    String recieved;
    String translated;

    public Guardian(){

    }

    public String getRecieved() {
        return recieved;
    }

    public void setRecieved(String recieved) {
        this.recieved = recieved;
    }

    public String getTranslated() {
        return translated;
    }

    public void setTranslated(String translated) {
        this.translated = translated;
    }
}
