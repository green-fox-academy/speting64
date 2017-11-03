package com.greenfox.reddit.controller;

import com.greenfox.reddit.model.Post;
import com.greenfox.reddit.repository.RedditRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;


@Controller
@RequestMapping("/posts")
public class MainController {

    long id;

    @Autowired
    RedditRepository redditRepository;

    @RequestMapping(value = {"/", ""})
    public String listAssignee(Model model) {
        model.addAttribute("post", redditRepository.findAll());
        return "posts";
    }
}
