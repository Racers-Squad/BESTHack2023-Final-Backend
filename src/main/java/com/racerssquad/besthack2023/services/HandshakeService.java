package com.racerssquad.besthack2023.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.integration.dsl.IntegrationFlow;
import org.springframework.messaging.MessageChannel;
import org.springframework.stereotype.Service;

@Service
public class HandshakeService {

    @Autowired
    public CentralService centralService;

    final MessageChannel HTTPChannelIn;

    public HandshakeService(MessageChannel HTTPChannelIn) {
        this.HTTPChannelIn = HTTPChannelIn;
    }

    @Bean
    public IntegrationFlow getMessage(){
        return IntegrationFlow.from(HTTPChannelIn).handle(System.out::println).get();
    }
}
