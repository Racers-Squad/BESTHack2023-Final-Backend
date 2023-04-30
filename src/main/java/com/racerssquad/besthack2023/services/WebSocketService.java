package com.racerssquad.besthack2023.services;

import com.racerssquad.besthack2023.DTO.EventDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Service;

@Service
public class WebSocketService {

    @Autowired
    SimpMessagingTemplate simpMessagingTemplate;
    @MessageMapping("/events")
    public void sendEvent(EventDTO event, String user){
        simpMessagingTemplate.convertAndSendToUser(user,"/queue/events", event);
    }


}
