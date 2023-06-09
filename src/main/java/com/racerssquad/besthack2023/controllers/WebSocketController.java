package com.racerssquad.besthack2023.controllers;

import com.racerssquad.besthack2023.DTO.ChartRequest;
import com.racerssquad.besthack2023.DTO.proto.ExchangeInfoMessage;
import com.racerssquad.besthack2023.services.CentralService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.BlockingQueue;

import static java.util.Arrays.asList;

@Controller
@Slf4j
public class WebSocketController implements Runnable {
    private final SimpMessagingTemplate messagingTemplate;

    @Autowired
    private CentralService centralService;

    @Autowired
    public WebSocketController(SimpMessagingTemplate messagingTemplate) {
        this.messagingTemplate = messagingTemplate;
    }

    @MessageMapping("/stock")
    @SendTo("/topic/stock")
    @CrossOrigin("*")
    public ArrayList<Number> handlePrice(ChartRequest stock) {
        log.debug("Getting information about stocks " + stock.getStock());
        ArrayList<Number> response = new ArrayList<>();
//        if (stock.getChartType().equals("1")) {
//            response = new ArrayList<>(Arrays.asList(1200, 1783, 1631, 2214, 2062, 2645, 2493, 3076,
//                    2924, 3507, 3355, 3938, 3786, 4369, 4217, 4800, 4648, 5231, 5079, 5662, 5510, 6093, 5941, 6524, 6372,
//                    6955, 6803, 7386, 7234, 7817, 7665, 8248, 8096, 8679, 8527, 9110, 8958, 9541, 9389, 9972, 9820, 10403,
//                    10251, 10834, 10682, 11265, 11113, 11696, 11544, 12127, 11975, 12558, 12406, 12989, 12837, 13420, 13268,
//                    13851, 13699, 14282));
//        }
        //@TODO реализовать данные второго графика
        messagingTemplate.convertAndSend("/topic/price", response);
        return response;
    }

    @Override
    public void run() {
        BlockingQueue<ExchangeInfoMessage> blockingQueue = centralService.getBlockingQueue();
        try {
            while (!Thread.currentThread().isInterrupted()) {
                ExchangeInfoMessage exchangeInfoMessage = blockingQueue.take();
                messagingTemplate.convertAndSend("/topic/price", exchangeInfoMessage.getEvent().getStatus().getAdvStatus().getData().getRowsList());
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

