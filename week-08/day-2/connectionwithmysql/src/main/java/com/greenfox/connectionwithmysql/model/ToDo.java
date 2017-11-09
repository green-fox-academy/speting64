package com.greenfox.connectionwithmysql.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.sql.Time;
import java.sql.Timestamp;
import java.time.LocalDate;

@Entity
@Table(name="todo")
public class ToDo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;

    private String title;

    boolean urgent;
    boolean done;

    Timestamp create2;
    Timestamp current2;

    @ManyToOne(fetch = FetchType.EAGER)
    Assignee assignee;

    public ToDo(String title ){
        this.title = title;
        this.urgent = false;
        this.done = false;
        this.create2 = new Timestamp(System.currentTimeMillis());
        this.current2 = new Timestamp(System.currentTimeMillis());
    }

    public ToDo(){

        this.title = "";
        done =false;
        urgent = false;
        this.create2 = new Timestamp(System.currentTimeMillis());
        this.current2 = new Timestamp(System.currentTimeMillis());
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isUrgent() {
        return urgent;
    }

    public void setUrgent(boolean urgent) {
        this.urgent = urgent;
    }

    public Timestamp getCreate2() {
        return create2;
    }

    public void setCreate2(Timestamp create2) {
        this.create2 = create2;
    }

    public Timestamp getCurrent() {
        return current2;
    }

    public void setCurrent(Timestamp current) {
        this.current2 = current2;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public Assignee getAssignee() {
        return assignee;
    }

    public void setAssignee(Assignee assignee) {
        this.assignee = assignee;
    }


    @Override
    public String toString() {
        return title;
    }
}
