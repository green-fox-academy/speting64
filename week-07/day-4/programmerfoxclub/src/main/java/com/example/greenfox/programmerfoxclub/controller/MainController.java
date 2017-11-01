package com.example.greenfox.programmerfoxclub.controller;

import com.example.greenfox.programmerfoxclub.Fox;
import com.example.greenfox.programmerfoxclub.model.Drink;
import com.example.greenfox.programmerfoxclub.model.Food;
import com.example.greenfox.programmerfoxclub.model.Tricks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    Food[] food = Food.values();
    Drink[] drink = Drink.values();

    @Autowired
    Fox fox;

    @Autowired
    Tricks tricks;

    @RequestMapping(value="/")
    public String index(Model model){
        model.addAttribute("fox",fox);
        return "index";
    }

    @RequestMapping(value="/nutritionstore")
    public String Nutrition(Model model){
        model.addAttribute("foodz",food);
        model.addAttribute("drinkz",drink);
        return "nutritionstore";
    }

    @RequestMapping(value="/nutritionstore/add")
    public String addNutrition(@RequestParam("food") String food , @RequestParam("drink") String drink){
        if(food.equals("")){
            food = "dat food";
        }
        if(drink.equals("")){
            food = "dat drink";
        }
        fox.setFood(food);
        fox.setDrink(drink);

        return "redirect:/nutritionstore";
    }

    @RequestMapping(value="/trick")
    public String trickCenter(Model model){
        model.addAttribute("trick",tricks.getTricks());
        return "trick";
    }

    @RequestMapping(value="/trick/learn")
    public String addTrick(@RequestParam("trick") String tricks){
        fox.addTrick(tricks);
        for (int i = 0; i < this.tricks.getTricks().size(); i++) {
            if (this.tricks.getTricks().get(i).equals(tricks)) {
                this.tricks.getTricks().remove(this.tricks.getTricks().get(i));
            }
        }
        return "redirect:/trick";
    }

    @RequestMapping(value="trick/addtrick")
    public String newTrick(@RequestParam("newtrick") String newTrick){
       tricks.addTrick(newTrick);
        return "redirect:/trick";
    }
}
