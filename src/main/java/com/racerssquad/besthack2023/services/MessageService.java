package com.racerssquad.besthack2023.services;

import org.springframework.stereotype.Service;

@Service
public class MessageService {

    public byte[] processMessage(byte[] message){
        String messageContent = new String(message);
        System.out.println("Received message:" + messageContent);
        String responseContent = String.format("Message \"%s\" is processed", messageContent);
        return responseContent.getBytes();
    }
}
