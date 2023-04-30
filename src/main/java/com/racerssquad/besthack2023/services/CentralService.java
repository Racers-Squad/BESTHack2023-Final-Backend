package com.racerssquad.besthack2023.services;

import com.racerssquad.besthack2023.DTO.proto.ExchangeInfoMessage;
import com.racerssquad.besthack2023.client.util.GenerateMsgUtils;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

@Service("central_service")
public class CentralService {

    public Message<ExchangeInfoMessage> processMessage(Message<ExchangeInfoMessage> msg) {
        String clientName = msg.getHeaders().getId().toString();
        System.out.println("Received request from client " + clientName);
        Message<ExchangeInfoMessage> resp = MessageBuilder.withPayload(GenerateMsgUtils.generateHandshakeReq("server")).build();
        return resp;
    }


}
