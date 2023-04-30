package com.racerssquad.besthack2023.services;

import com.racerssquad.besthack2023.DTO.proto.ExchangeInfoMessage;
import com.racerssquad.besthack2023.client.util.GenerateMsgUtils;
import com.racerssquad.besthack2023.util.EISSystemInformation;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("central_service")
public class CentralService {

    List<EISSystemInformation> birzhi;

    public ExchangeInfoMessage processMessage(Message<ExchangeInfoMessage> msg) {
        String clientName = msg.getHeaders().getId().toString();
        System.out.println("Received request from client " + clientName);
        return GenerateMsgUtils.generateHandshakeReq("server");
    }


}
