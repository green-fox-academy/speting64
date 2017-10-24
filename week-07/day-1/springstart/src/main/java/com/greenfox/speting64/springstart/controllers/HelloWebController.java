package com.greenfox.speting64.springstart.controllers;

import java.awt.*;

import com.greenfox.speting64.springstart.ColorGreeting;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.concurrent.atomic.AtomicLong;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

@Controller
public class HelloWebController {

    String[] hellos = {"Mirëdita", "Ahalan", "Parev", "Zdravei", "Nei Ho", "Dobrý den", "Ahoj", "Goddag", "Goede dag, Hallo", "Hello", "Saluton", "Hei", "Bonjour",
            "Guten Tag", "Gia'sou", "Aloha", "Shalom", "Namaste", "Namaste", "Jó napot", "Halló", "Helló", "Góðan daginn", "Halo", "Aksunai", "Qanuipit", "Dia dhuit",
            "Salve", "Ciao", "Kon-nichiwa", "An-nyong Ha-se-yo", "Salvëte", "Ni hao", "Dzien' dobry", "Olá", "Bunã ziua", "Zdravstvuyte", "Hola", "Jambo", "Hujambo", "Hej",
            "Sa-wat-dee", "Merhaba", "Selam", "Vitayu", "Xin chào", "Hylo", "Sut Mae", "Sholem Aleychem", "Sawubona"};

    AtomicLong counter = new AtomicLong(1);

    @RequestMapping("/web/greetingworld")
    public String greeting(Model model, @RequestParam("name") String name) {

        List<ColorGreeting> greets = new ArrayList<>();

        model.addAttribute("name", " Viktor");
        model.addAttribute("id", counter.getAndIncrement());
        model.addAttribute("hellos", getRandomHellos());

        return "greeting";
    }

    public String getRandomHellos() {
        return hellos[(int)(Math.random() * hellos.length)];

    }

    public String getRandomColors() {
        return hellos[(int)(Math.random() * hellos.length)];

    }
}

