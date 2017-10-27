package com.example.greenfox.programmerfoxclub.controller;

import com.example.greenfox.programmerfoxclub.Fox;
import com.example.greenfox.programmerfoxclub.model.Drink;
import com.example.greenfox.programmerfoxclub.model.Food;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;

@Controller
public class MainController {

    Food[] food = Food.values();
    Drink[] drink = Drink.values();

    @Autowired
    Fox fox;


    @RequestMapping(value="/")
    public String index(Model model){
        model.addAttribute("fox",fox);
        return "index";
    }

    @RequestMapping(value="/nutritionstore")
    public String getNutrition(Model model){
        model.addAttribute("foodz",food);
        model.addAttribute("drinkz",drink);
        return "nutritionstore";
    }


}
