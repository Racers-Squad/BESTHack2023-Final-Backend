package com.racerssquad.besthack2023.services;

import com.racerssquad.besthack2023.DTO.proto.*;
import com.racerssquad.besthack2023.util.EISSystemInformation;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

@Service("central_service")
@Data
public class CentralService {

    private int birzhaId = 0;
    List<EISSystemInformation> birzhi = new ArrayList<>();
    BlockingQueue<ExchangeInfoMessage> blockingQueue = new LinkedBlockingQueue<>(50);

    public void addEIS(String connectionIP, List<OwnCommand> supportedCommands){
        EISSystemInformation birzha = new EISSystemInformation(birzhaId, "EIS" + birzhaId, connectionIP, supportedCommands);
        birzhaId +=1;
        birzhi.add(birzha);
        System.out.println("Amount" + birzhi.size() + " Dobavili " + birzha);
    }

    public void showEvent(ExchangeInfoMessage eventMessage) {
        blockingQueue.add(eventMessage);
        Event event = eventMessage.getEvent();
        Status eventStatus = event.getStatus();
        AdvInfo eventAdvInfo = eventStatus.getAdvStatus();
        System.out.println(eventStatus.getDetails() + "\n" + eventStatus.getType().toString() + "\n"
        +"next time is: " + eventStatus.getNextTime());
        System.out.println("adv info " + eventAdvInfo.getCaption() + " " + eventAdvInfo.getData().getRowsList());
    }
}
