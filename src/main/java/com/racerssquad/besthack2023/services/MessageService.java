package com.racerssquad.besthack2023.services;

import lombok.extern.slf4j.Slf4j;
import com.racerssquad.besthack2023.DTO.proto.ExchangeInfoMessage;
import com.racerssquad.besthack2023.util.MessageToExchangeInfoDeserializer;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Service;

@Service
@Slf4j

@Service("mes_service")
public class MessageService {

    public byte[] processMessage(byte[] message){
        String messageContent = new String(message);
        log.trace("Received message: " + messageContent);
        String responseContent = String.format("Message \"%s\" is processed", messageContent);
        return responseContent.getBytes();
    public ExchangeInfoMessage processMessage(Message<ExchangeInfoMessage> msg) {
        System.out.println("Received message:" + msg.getPayload().getRequest().getCommand().name());
        return msg.getPayload();
    }
}
