package com.racerssquad.besthack2023.services;

import com.racerssquad.besthack2023.DTO.proto.ExchangeInfoMessage;
import com.racerssquad.besthack2023.DTO.proto.Header;
import com.racerssquad.besthack2023.DTO.proto.MessageEnumsProto;
import com.racerssquad.besthack2023.DTO.proto.Response;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

@Service("handshake_service")
public class HandshakeService {

    public Message<ExchangeInfoMessage> processMessage(Message<ExchangeInfoMessage> msg) {
        ExchangeInfoMessage exchInfoMessage = msg.getPayload();
        if (exchInfoMessage.getRequest().getCommand() == MessageEnumsProto.CommandType.ctHandshake) {
            System.out.println("handshake");
            ExchangeInfoMessage handshakeResp = ExchangeInfoMessage.newBuilder()
                    .setHeader(Header.newBuilder()
                            .setMessageNumAnswer(exchInfoMessage.getHeader().getMessageNum())
                            .setReceiver(exchInfoMessage.getHeader().getSender())
                            .setSender(exchInfoMessage.getHeader().getReceiver()))
                    .setResponse(Response.newBuilder()
                            .setCommand(MessageEnumsProto.CommandType.ctHandshake)
                            .build())
                    .build();
            return MessageBuilder.withPayload(handshakeResp).build();
        }
        return msg;
    }
}
