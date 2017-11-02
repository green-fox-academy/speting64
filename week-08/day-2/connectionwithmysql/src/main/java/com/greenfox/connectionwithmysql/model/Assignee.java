package com.greenfox.connectionwithmysql.model;

import java.util.ArrayList;
import java.util.List;

public class Assignee {

    String name;
    String eMail;

    public Assignee(){

    }

    public Assignee(String name, String eMail){

        this.name=name;
        this.eMail=eMail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }


}
