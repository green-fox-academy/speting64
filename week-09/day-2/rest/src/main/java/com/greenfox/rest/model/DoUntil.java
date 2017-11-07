package com.greenfox.rest.model;


import lombok.Getter;
import org.springframework.stereotype.Component;

@Getter
public class DoUntil {



    //int until;
    int result;
    //String what;

   /* public void setUntil(int until) {
        this.until = until;
    }

    public void setWhat(String what) {
        this.what = what;
    }*/

    public DoUntil(){

    }

    public int getResult() {
        return this.result;
    }

    public DoUntil(String what, int until) {
        if(what.equals("sum")){
            sum(until);
        }else{
            result=factor(until);
        }

    }

    public void sum(int until){
        this.result = 0;
        for (int i = 0; i <= until ; i++) {
            this.result += i;
        }
    }

    public int factor(int until){
        this.result = 1;
        if(until==1){
            return 1;
        }else{
            return until*factor(until-1);
        }
    }
}
