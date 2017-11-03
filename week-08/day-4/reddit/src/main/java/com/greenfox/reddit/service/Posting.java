package com.greenfox.reddit.service;

import com.greenfox.reddit.model.Post;
import com.greenfox.reddit.repository.RedditRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;

@Service
public class Posting {

    @Autowired
    RedditRepository redditRepository;

    public void upVote(long id){
        Post post = redditRepository.findOne(id);
        post.setScore(post.getScore()+1);
        redditRepository.save(post);
    }

    public void downVote(long id){
        Post post = redditRepository.findOne(id);
        post.setScore(post.getScore()-1);
        redditRepository.save(post);
    }
}
