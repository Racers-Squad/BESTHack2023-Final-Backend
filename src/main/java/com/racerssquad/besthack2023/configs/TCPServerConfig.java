package com.racerssquad.besthack2023.configs;

import com.racerssquad.besthack2023.handler.MyTcpNioConnectionSupport;
import com.racerssquad.besthack2023.util.CustomDeserializer;
import com.racerssquad.besthack2023.util.CustomSerializer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.integration.annotation.IntegrationComponentScan;
import org.springframework.integration.channel.DirectChannel;
import org.springframework.integration.config.EnableIntegration;
import org.springframework.integration.dsl.IntegrationFlow;
import org.springframework.integration.ip.tcp.TcpInboundGateway;
import org.springframework.integration.ip.tcp.TcpOutboundGateway;
import org.springframework.integration.ip.tcp.connection.AbstractServerConnectionFactory;
import org.springframework.integration.ip.tcp.connection.TcpNioServerConnectionFactory;
import org.springframework.messaging.MessageChannel;

@Configuration
@EnableIntegration
@IntegrationComponentScan
public class TCPServerConfig {

    @Value("${tcp.server.port}")
    private int port;

    private final CustomDeserializer deserializer = new CustomDeserializer();

    private final CustomSerializer serializer = new CustomSerializer();

    @Bean
    public AbstractServerConnectionFactory serverConnectionFactory() {
        TcpNioServerConnectionFactory serverConnectionFactory = new TcpNioServerConnectionFactory(port);
        serverConnectionFactory.setUsingDirectBuffers(true);
        serverConnectionFactory.setDeserializer(deserializer);
        serverConnectionFactory.setSerializer(serializer);
        serverConnectionFactory.setTcpNioConnectionSupport(new MyTcpNioConnectionSupport());
        return serverConnectionFactory;
    }

    @Bean("TCPChannelOut")
    public MessageChannel outboundTCPChannel() {
        return new DirectChannel();
    }

    @Bean("HTTPChannelIn")
    public MessageChannel inboundHTTPChannel() {
        return new DirectChannel();
    }

    @Bean("TCPChannelIn")
    public MessageChannel inboundTCPChannel() {
        return new DirectChannel();
    }

    @Bean("HTTPChannelOut")
    public MessageChannel outboundHTTPChannel() {
        return new DirectChannel();
    }

    @Bean
    public TcpInboundGateway inboundGateway(AbstractServerConnectionFactory serverConnectionFactory,
                                            MessageChannel TCPChannelOut) {
        TcpInboundGateway tcpInboundGateway = new TcpInboundGateway();
        tcpInboundGateway.setConnectionFactory(serverConnectionFactory);
        tcpInboundGateway.setRequestChannel(TCPChannelOut);
        return tcpInboundGateway;
    }

    @Bean
    public TcpOutboundGateway outboundGateway(MessageChannel TCPChannelIn) {
        TcpOutboundGateway tcpOutboundGateway = new TcpOutboundGateway();
        tcpOutboundGateway.setReplyChannel(TCPChannelIn);
        return tcpOutboundGateway;
    }

    @Bean
    public IntegrationFlow integrationFlowTCP2HTTP() {
        return IntegrationFlow.from(outboundTCPChannel())
                .channel(inboundHTTPChannel())
                .get();
    }

    @Bean
    public IntegrationFlow integrationFlowHTTP2TCP(){
        return IntegrationFlow.from(outboundHTTPChannel())
                .channel(inboundTCPChannel())
                .get();
    }
}
