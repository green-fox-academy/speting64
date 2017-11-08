package com.greenfox.connectionwithmysql.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class ToDo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;

    private String title;
    boolean isUrgent;
    boolean isDone;

    @DateTimeFormat(pattern = "mm/dd/yyyy")
    LocalDate create;

    @DateTimeFormat(pattern = "mm/dd/yyyy")
    LocalDate current;

    @ManyToOne(cascade = CascadeType.ALL)
    Assignee assignee;

    public ToDo(String title){
        this.title = title;
        this.isUrgent = false;
        this.isDone = false;
        this.create = LocalDate.now();
        this.current = LocalDate.now();
    }

    public ToDo(String title , Boolean urgent , Boolean done ){
        this.title = title;
        isUrgent = urgent;
        isDone = done;
    }

    public ToDo(){
        isDone =false;
        isUrgent = false;
        this.create = LocalDate.now();
        this.current = LocalDate.now();
    }

    /*public ToDo(){
        this.create = LocalDate.now();
        this.current = LocalDate.now();
    }*/

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
        return isUrgent;
    }

    public void setUrgent(boolean urgent) {
        isUrgent = urgent;
    }

    public boolean isDone() {
        return isDone;
    }

    public void setDone(boolean done) {
        isDone = done;
    }

    public Assignee getAssignee() {
        return assignee;
    }

    public void setAssignee(Assignee assignee) {
        this.assignee = assignee;
    }

    public LocalDate getCreate() {
        return create;
    }

    public void setCreate(LocalDate create) {
        this.create = create;
    }

    public LocalDate getCurrent() {
        return current;
    }

    public void setCurrent(LocalDate current) {
        this.current = current;
    }

    @Override
    public String toString() {
        return title;
    }
}
