package com.racerssquad.besthack2023.services;

import com.racerssquad.besthack2023.DTO.CommandRequest;
import com.racerssquad.besthack2023.DTO.proto.ExchangeInfoMessage;
import com.racerssquad.besthack2023.DTO.proto.OwnCommand;
import com.racerssquad.besthack2023.util.EISSystemInformation;
import com.racerssquad.besthack2023.util.GenerateRequestToExecuteCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("central_service")
public class CentralService {

    @Autowired
    public MessageChannel HTTPChannelOut;

    @Autowired
    public GenerateRequestToExecuteCommand execCommandGenerator;

    private int birzhaId = 0;
    List<EISSystemInformation> birzhi = new ArrayList<>();
    public void addEIS(String connectionIP, List<OwnCommand> supportedCommands){
        EISSystemInformation birzha = new EISSystemInformation(birzhaId, "EIS" + birzhaId, connectionIP, supportedCommands);
        birzhaId +=1;
        birzhi.add(birzha);
        System.out.println("Amount" + birzhi.size() + " Dobavili " + birzha);
    }

    public Message<ExchangeInfoMessage> processMessage(Message<ExchangeInfoMessage> msg){
        return msg;
    }

    public void executeCommand(String bId, CommandRequest request){
        ExchangeInfoMessage msg = execCommandGenerator.createRequestToExecCommand(bId, request);
        HTTPChannelOut.send(MessageBuilder.withPayload(msg).build());
    }

}
