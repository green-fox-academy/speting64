package com.greenfox.reddit.controller;

import com.greenfox.reddit.model.Post;
import com.greenfox.reddit.service.Posting;
import com.greenfox.reddit.repository.RedditRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/posts")
public class MainController {

    long id;

    @Autowired
    RedditRepository redditRepository;

    @Autowired
    Posting posting;

    @GetMapping(value = {"", "/"})
    public String listPost(Model model) {
        model.addAttribute("post", redditRepository.findAll());
        return "posts";
    }

    @GetMapping("/add")
    public String add(Model model){
        model.addAttribute("post" , new Post());
        return "add";
    }

    @PostMapping("/add")
    public String addPost(@ModelAttribute Post post){
        redditRepository.save(post);
        return "redirect:/posts/";
    }

    @GetMapping("/{id}/upvote")
    public String voteUp(@PathVariable (value = "id") long id) {
        posting.upVote(id);
        return "redirect:/posts";
    }

    @GetMapping("/{id}/downvote")
    public String voteDown(@PathVariable (value = "id") long id) {
        posting.downVote(id);
        return "redirect:/posts";
    }
}
