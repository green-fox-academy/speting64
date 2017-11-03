package com.greenfox.reddit;

import com.greenfox.reddit.repository.RedditRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RedditApplication {

	@Autowired
	RedditRepository redditRepository;

	public static void main(String[] args) {
		SpringApplication.run(RedditApplication.class, args);
	}
}
