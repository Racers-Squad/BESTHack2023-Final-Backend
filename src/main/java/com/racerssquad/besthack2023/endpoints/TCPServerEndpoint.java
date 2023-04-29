package com.racerssquad.besthack2023.endpoints;

import com.racerssquad.besthack2023.services.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.integration.annotation.MessageEndpoint;
import org.springframework.integration.annotation.ServiceActivator;

@MessageEndpoint
public class TCPServerEndpoint {

    private final MessageService messageService;

    @Autowired
    public TCPServerEndpoint(MessageService messageService) {
        this.messageService = messageService;
    }

    @ServiceActivator(inputChannel = "inboundChannel")
    public byte[] process(byte[] message){
        return messageService.processMessage(message);
    }
}
