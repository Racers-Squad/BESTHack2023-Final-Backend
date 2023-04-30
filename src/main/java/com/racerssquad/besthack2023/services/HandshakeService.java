package com.racerssquad.besthack2023.services;

import com.racerssquad.besthack2023.DTO.proto.ExchangeInfoMessage;
import com.racerssquad.besthack2023.client.util.GenerateMsgUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Service;

@Service("handshake_service")
public class HandshakeService {

    @Autowired
    public CentralService centralService;


    public ExchangeInfoMessage processMessage(Message<ExchangeInfoMessage> msg) {
        String clientName = msg.getHeaders().getId().toString();
        System.out.println("Received request from client " + clientName);
        return GenerateMsgUtils.generateHandshakeReq("server");
    }

}
