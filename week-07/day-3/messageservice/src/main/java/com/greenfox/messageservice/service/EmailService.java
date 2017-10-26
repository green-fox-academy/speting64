package com.greenfox.messageservice.service;

public class EmailService implements MessageService {

    @Override
    public void sendMessage(String content, String address){
        System.out.println("Email Sent to "+ address + " with Content = " + content);
    }
}
