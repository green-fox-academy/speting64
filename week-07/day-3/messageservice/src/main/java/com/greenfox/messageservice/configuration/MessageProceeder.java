package com.greenfox.messageservice.configuration;

import com.greenfox.messageservice.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MessageProceeder {

    MessageService messageService;

    public MessageProceeder(MessageService messageService) {
        this.messageService = messageService;
    }

    public void processMessage(String message, String address) {
        messageService.sendMessage(message, address);
    }
}
