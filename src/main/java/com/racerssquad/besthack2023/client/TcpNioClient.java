package com.racerssquad.besthack2023.client;

import com.racerssquad.besthack2023.DTO.proto.ExchangeInfoMessage;
import com.racerssquad.besthack2023.DTO.proto.Header;
import com.racerssquad.besthack2023.DTO.proto.MessageEnumsProto;
import com.racerssquad.besthack2023.DTO.proto.Request;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;

public class TcpNioClient {


    private static final String HOSTNAME = "localhost";
    private static final int PORT = 2729;

    public static void main(String[] args) throws IOException {
        SocketChannel client = SocketChannel.open();
        client.connect(new InetSocketAddress(HOSTNAME, PORT));
        ClientUtil clientUtil = new ClientUtil();
        System.out.println("Connected to server at " + HOSTNAME + ":" + PORT);


        ExchangeInfoMessage msg = ExchangeInfoMessage.newBuilder()
                .setHeader(Header.newBuilder()
                        .setMessageNum("1")
                        .setTimestamp(212312312213L)
                        .setSender("matthew client")
                )
                .setRequest(Request.newBuilder()
                        .setCommand(MessageEnumsProto.CommandType.ctHandshake)
                        .build())
                .build();

        ByteBuffer buffer = ByteBuffer.wrap(clientUtil.serialize(msg));

        client.write(buffer);

        buffer.clear();
        ExchangeInfoMessage receive = (ExchangeInfoMessage) clientUtil.receive(client, buffer);
        buffer.flip();
        byte[] data = new byte[buffer.remaining()];
        buffer.get(data);
        System.out.println(receive.getHeader().getReceiver());

        client.close();
    }

}
