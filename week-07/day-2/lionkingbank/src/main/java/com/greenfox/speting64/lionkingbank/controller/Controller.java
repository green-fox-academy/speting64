package com.greenfox.speting64.lionkingbank.controller;

import com.greenfox.speting64.lionkingbank.model.BankAccount;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@org.springframework.stereotype.Controller
public class Controller {

    @RequestMapping("/Exercise1")
    public String bankAccount(Model model){
        BankAccount simbaAccount = new BankAccount("Simba" , 2000 , "lion");
        model.addAttribute("simbaAccount", simbaAccount);

        return "Exercise1";
    }
}
