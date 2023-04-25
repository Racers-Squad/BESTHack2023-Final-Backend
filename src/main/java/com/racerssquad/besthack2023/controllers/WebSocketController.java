package com.racerssquad.besthack2023.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;

@Controller
public class WebSocketController {
    private final SimpMessagingTemplate messagingTemplate;

    @Autowired
    public WebSocketController(SimpMessagingTemplate messagingTemplate) {
        this.messagingTemplate = messagingTemplate;
    }

    @MessageMapping("/auth")
    @SendTo("/topic/auth")
    @CrossOrigin("*")
    public String handlePing(String message) {
        System.out.println("Received message: " + message);
        String response = "Pong " + System.currentTimeMillis();
        messagingTemplate.convertAndSend("/topic/auth", response);
        return response;
    }
}
