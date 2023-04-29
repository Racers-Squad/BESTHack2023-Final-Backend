package com.racerssquad.besthack2023.services;

import com.racerssquad.besthack2023.DTO.proto.ExchangeInfoMessage;
import com.racerssquad.besthack2023.DTO.proto.MessageEnumsProto;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Service;

@Service("handshake_service")
public class HandshakeService {

    public ExchangeInfoMessage processHandshake(Message<ExchangeInfoMessage> msg) {
        ExchangeInfoMessage payload = msg.getPayload();
        if (payload.getRequest().getCommand() == MessageEnumsProto.CommandType.ctHandshake) {
            System.out.println("ETO HANDSHAKE!!");
        }
        return payload;
    }
}
