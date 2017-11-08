package com.example.endpoint.model;

import org.springframework.stereotype.Service;

@Service
public class Arrow {

    double distance;
    double time;
    double speed;


    public Arrow(){

    }

    /*public Arrow(double distance,double time){

        this.distance=distance;
        this.time = time;
        this.speed = distance/time;
    }*/

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }

    public double getSpeed() {
        return this.distance/this.time;
    }

   /* public void setSpeed(double speed){
        this.speed = speed;
    }*/
}
