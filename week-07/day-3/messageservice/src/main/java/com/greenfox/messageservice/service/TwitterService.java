package com.greenfox.messageservice.service;

public class TwitterService implements MessageService {

    @Override
    public void sendMessage(String content, String address){
        System.out.println("Tweet Sent to "+ address + " with Content = " + content);
    }
}
