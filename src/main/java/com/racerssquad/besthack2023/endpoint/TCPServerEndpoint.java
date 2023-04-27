package com.racerssquad.besthack2023.endpoint;

import com.racerssquad.besthack2023.services.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.integration.annotation.MessageEndpoint;
import org.springframework.integration.annotation.ServiceActivator;

@MessageEndpoint
public class TCPServerEndpoint {

    private MessageService messageService;

    @Autowired
    public TCPServerEndpoint(MessageService messageService) {
        this.messageService = messageService;
    }

    @ServiceActivator(inputChannel = "tcpChannel")
    public byte[] process(byte[] message) {
        return messageService.processMessage(message);
    }
}
