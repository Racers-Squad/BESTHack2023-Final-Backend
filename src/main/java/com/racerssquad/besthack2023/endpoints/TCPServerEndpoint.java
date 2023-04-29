package com.racerssquad.besthack2023.endpoints;

import com.racerssquad.besthack2023.services.MessageService;
import org.springframework.integration.annotation.MessageEndpoint;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.messaging.Message;

@MessageEndpoint
public class TCPServerEndpoint {

    private final MessageService messageService;

    public TCPServerEndpoint(MessageService messageService) {
        this.messageService = messageService;
    }

    @ServiceActivator(inputChannel = "inboundChannel")
    public byte[] process(Message<String> msg) {
        return messageService.processMessage(msg);
    }
}
