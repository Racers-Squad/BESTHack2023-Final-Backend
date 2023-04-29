package com.racerssquad.besthack2023.services;

import lombok.extern.slf4j.Slf4j;
import com.racerssquad.besthack2023.DTO.proto.ExchangeInfoMessage;
import com.racerssquad.besthack2023.util.MessageToExchangeInfoDeserializer;
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
