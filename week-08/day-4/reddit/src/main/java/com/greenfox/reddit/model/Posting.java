package com.greenfox.reddit.model;

import com.greenfox.reddit.repository.RedditRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class Posting {

    @Autowired
    RedditRepository redditRepository;

    public List<Post> listPosts(){
        List<Post> post = new ArrayList<>();
        redditRepository.save(post);
        return post;
    }

    public Post returnOne(long id){
        return redditRepository.findOne(id);
    }
}
