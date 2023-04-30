package com.racerssquad.besthack2023.endpoints;

import com.racerssquad.besthack2023.DTO.proto.ExchangeInfoMessage;
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
    public ExchangeInfoMessage process(Message<ExchangeInfoMessage> msg) {
        return messageService.processMessage(msg);
    }

}
