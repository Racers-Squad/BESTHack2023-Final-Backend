package com.racerssquad.besthack2023.services;

import com.racerssquad.besthack2023.DTO.proto.ExchangeInfoMessage;
import lombok.extern.slf4j.Slf4j;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Service;

@Slf4j

@Service("mes_service")
public class MessageService {
    public ExchangeInfoMessage processMessage(Message<ExchangeInfoMessage> msg) {
        log.trace("Received message:" + msg.getPayload().getRequest().getCommand().name());
        return msg.getPayload();
    }
}

