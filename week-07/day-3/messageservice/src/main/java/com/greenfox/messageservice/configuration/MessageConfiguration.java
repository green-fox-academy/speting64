package com.greenfox.messageservice.configuration;

import com.greenfox.messageservice.service.EmailService;
import com.greenfox.messageservice.service.MessageProceeder;
import com.greenfox.messageservice.service.TwitterService;
import com.greenfox.messageservice.service.MessageService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MessageConfiguration {

    @Bean
    public MessageProceeder messageProceeder() {
        return new MessageProceeder();
    }

    @Bean(name = "email")
    public EmailService emailService(){
        return new EmailService();
    }

    @Bean(name = "tweet")
    public TwitterService twitterService(){
        return new TwitterService();
    }
}
