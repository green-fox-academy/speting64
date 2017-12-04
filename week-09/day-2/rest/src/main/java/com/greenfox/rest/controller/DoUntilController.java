package com.greenfox.rest.controller;

import com.greenfox.rest.model.DoUntil;
import com.greenfox.rest.model.ErrorMessage;
import com.greenfox.rest.model.Until;
import jdk.nashorn.internal.objects.annotations.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;


@RestController
public class DoUntilController {

    @RequestMapping(value = "/dountil/{what}" , method = RequestMethod.POST)
    public Object doUntilNumber(@PathVariable("what") String what , @RequestBody Until until){
        ErrorMessage e = new ErrorMessage();
        if(until.getUntil() == null){
            e.setError("Please provide a number!");
            return e;
        }
        return new DoUntil(what,until.getUntil());
    }
}
