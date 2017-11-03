package com.greenfox.reddit.repository;

import org.springframework.data.repository.CrudRepository;

import com.greenfox.reddit.model.Post;

public interface RedditRepository extends CrudRepository <Post , Long> {
}
