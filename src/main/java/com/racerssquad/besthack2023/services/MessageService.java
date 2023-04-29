package com.racerssquad.besthack2023.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class MessageService {

    public byte[] processMessage(byte[] message){
        String messageContent = new String(message);
        log.trace("Received message: " + messageContent);
        String responseContent = String.format("Message \"%s\" is processed", messageContent);
        return responseContent.getBytes();
    }
}
