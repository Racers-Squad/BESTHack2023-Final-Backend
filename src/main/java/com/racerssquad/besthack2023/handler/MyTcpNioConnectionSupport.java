package com.racerssquad.besthack2023.handler;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.integration.ip.tcp.connection.TcpNioConnection;
import org.springframework.integration.ip.tcp.connection.TcpNioConnectionSupport;

import java.nio.channels.SocketChannel;

public class MyTcpNioConnectionSupport implements TcpNioConnectionSupport {

    @Override
    public TcpNioConnection createNewConnection(SocketChannel socketChannel, boolean server, boolean lookupHost, ApplicationEventPublisher applicationEventPublisher, String connectionFactoryName) {
        TcpNioConnection tcpNioConnection = new TcpNioConnection(socketChannel, server, lookupHost, applicationEventPublisher, connectionFactoryName);
        System.out.println("connected");
        return tcpNioConnection;
    }
}
