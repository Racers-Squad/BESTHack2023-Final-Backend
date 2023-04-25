package com.racerssquad.besthack2023.configs;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.integration.channel.DirectChannel;
import org.springframework.integration.config.EnableIntegration;
import org.springframework.integration.dsl.IntegrationFlow;
import org.springframework.integration.dsl.IntegrationFlows;
import org.springframework.integration.dsl.Transformers;
import org.springframework.integration.ip.dsl.Tcp;
import org.springframework.integration.ip.tcp.TcpInboundGateway;
import org.springframework.integration.ip.tcp.connection.AbstractServerConnectionFactory;
import org.springframework.integration.ip.tcp.connection.TcpNioServerConnectionFactory;
import org.springframework.integration.ip.tcp.serializer.TcpCodecs;
import org.springframework.messaging.MessageChannel;

@Configuration
public class IntegrationTCPConfig {

    @Value("${tcp.server.port}")
    private int port;

    @Bean
    public AbstractServerConnectionFactory serverConnectionFactory() {
        TcpNioServerConnectionFactory serverConnectionFactory = new TcpNioServerConnectionFactory(port);
        serverConnectionFactory.setUsingDirectBuffers(true);
        return serverConnectionFactory;
    }

    @Bean
    public MessageChannel inboundChannel() {
        return new DirectChannel();
    }

    @Bean
    public TcpInboundGateway inboundGateway(AbstractServerConnectionFactory serverConnectionFactory,
                                            MessageChannel inboundChannel) {
        TcpInboundGateway tcpInboundGateway = new TcpInboundGateway();
        tcpInboundGateway.setConnectionFactory(serverConnectionFactory);
        tcpInboundGateway.setRequestChannel(inboundChannel);
        return tcpInboundGateway;
    }
//    private final ServerProps props;
//
//    private final MessageTransformer transformer;
//
//    public IntegrationTCPConfig(ServerProps props, MessageTransformer transformer){
//        this.props = props;
//        this.transformer = transformer;
//    }
//
//    @Bean
//    public IntegrationFlow integrationFlow(){
//        return IntegrationFlows.from(Tcp.inboundGateway(Tcp.nioServer(this.props.getPort())
//                .deserializer(TcpCodecs.crlf())
//                .get()))
//                .transform(Transformers.objectToString())
//                .transform(this.transformer)
//                .get();
//    }
}
