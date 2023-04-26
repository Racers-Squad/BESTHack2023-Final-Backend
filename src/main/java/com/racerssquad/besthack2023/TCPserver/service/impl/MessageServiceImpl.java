package com.racerssquad.besthack2023.TCPserver.service.impl;

import com.racerssquad.besthack2023.TCPserver.service.MessageService;
import org.springframework.stereotype.Service;

@Service
public class MessageServiceImpl implements MessageService {

    @Override
    public byte[] processMessage(byte[] message) {
        String messageContent = new String(message);
        System.out.println("Receive message:" + messageContent);
        String responseContent = String.format("Message \"%s\" is processed", messageContent);
        return responseContent.getBytes();
    }
}
