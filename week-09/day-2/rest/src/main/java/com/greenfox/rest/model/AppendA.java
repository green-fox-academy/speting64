package com.greenfox.rest.model;

import org.springframework.stereotype.Component;

@Component
public class AppendA {

    String appended;

    public AppendA() {

    }

    public void setAppended(String appended) {
        this.appended = appended;
    }

    public String getAppended() {
        return appended + "a";
    }
}
