package com.racerssquad.besthack2023.client;

import com.racerssquad.besthack2023.DTO.proto.*;
import com.racerssquad.besthack2023.client.util.GenerateMsgUtils;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.integration.dsl.MessageChannels;
import org.springframework.integration.ip.tcp.TcpReceivingChannelAdapter;
import org.springframework.integration.ip.tcp.connection.TcpConnectionSupport;
import org.springframework.integration.ip.tcp.connection.TcpNioClientConnectionFactory;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.GenericMessage;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;


public class TcpNioClient {


    private static final String HOSTNAME = "localhost";
    private static final int PORT = 2729;

    public static void main(String[] args) throws IOException, InterruptedException {

        SocketChannel client = SocketChannel.open();
        client.connect(new InetSocketAddress(HOSTNAME, PORT));
        ClientUtil clientUtil = new ClientUtil();
        System.out.println("Connected to server at " + HOSTNAME + ":" + PORT);

        ExchangeInfoMessage msg = GenerateMsgUtils.generateHandshakeReq("test_client");

        ByteBuffer buffer = ByteBuffer.wrap(clientUtil.serialize(msg));
        client.write(buffer);
        System.out.println("send");
        buffer.clear();
        ExchangeInfoMessage receive = (ExchangeInfoMessage) clientUtil.receive(client, buffer);
        buffer.flip();
        byte[] data = new byte[buffer.remaining()];
        buffer.get(data);
        System.out.println(receive.getHeader().getReceiver());
//        Thread.sleep(5000L);
        client.close();
    }
}
