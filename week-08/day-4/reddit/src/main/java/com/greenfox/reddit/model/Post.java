package com.greenfox.reddit.model;

import javax.persistence.*;

@Table(name = "reddit")
@Entity
public class Post {

    @Id

    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;
    int score;
    String content;


    public Post(){
        this.score=0;
        this.content="";
    }

    public Post(int score ,String content){

        this.score=0;
        this.content=content;

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}

