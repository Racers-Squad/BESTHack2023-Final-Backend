package com.racerssquad.besthack2023.services;

import org.springframework.messaging.Message;
import org.springframework.stereotype.Service;

import java.nio.charset.StandardCharsets;

@Service("mes_service")
public class MessageService {

    public byte[] processMessage(Message<String> msg){
        String messageContent = new String(msg.getPayload().getBytes(StandardCharsets.UTF_8));
        System.out.println("Received message:" + messageContent);
        String responseContent = String.format("Message \"%s\" is processed", messageContent);
        return responseContent.getBytes();
    }
}
