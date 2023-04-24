package com.racerssquad.besthack2023.controllers;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class WebSocketController {
    @MessageMapping("/ping")
    @SendTo("/topic/pong")
    public String pingPong(String message) throws Exception {
        Thread.sleep(1000);
        return "pong";
    }
}
