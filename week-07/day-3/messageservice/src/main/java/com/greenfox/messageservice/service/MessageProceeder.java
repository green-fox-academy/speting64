package com.greenfox.messageservice.service;

import com.greenfox.messageservice.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;

public class MessageProceeder {

    @Autowired
    EmailService emailService;

    @Autowired
    TwitterService twitterService;

    public void processMessage(String content, String address){
        String[] chat =address.split("@");
        if(chat[0].equals("")){
            emailService.sendMessage(content,address);
        }else{
            twitterService.sendMessage(content,address);
        }
    }
}
