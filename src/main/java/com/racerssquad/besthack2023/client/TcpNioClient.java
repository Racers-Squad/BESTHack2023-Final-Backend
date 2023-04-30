package com.racerssquad.besthack2023.client;

import com.racerssquad.besthack2023.DTO.proto.*;
import com.racerssquad.besthack2023.client.util.GenerateMsgUtils;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.SocketChannel;
import java.util.Iterator;
import java.util.Set;


public class TcpNioClient {


    private static final String HOSTNAME = "localhost";
    private static final int PORT = 2729;
    static int count = 0;

    public static void main(String[] args) throws IOException, InterruptedException, ClassNotFoundException {
        System.setProperty("java.io.stdout", "unbuffered");
        SocketChannel client = SocketChannel.open();
        client.configureBlocking(false);
        client.connect(new InetSocketAddress(HOSTNAME, PORT));
        ClientUtil clientUtil = new ClientUtil();
        System.out.println("Connecting to server at " + HOSTNAME + ":" + PORT);

        Selector selector = Selector.open();
        client.register(selector, SelectionKey.OP_CONNECT);

        while (true) {
            if (selector.select() > 0) {
                Set<SelectionKey> keys = selector.selectedKeys();
                Iterator<SelectionKey> iterator = keys.iterator();
                while (iterator.hasNext()) {
                    SelectionKey key = iterator.next();
                    if (key.isConnectable()) {
                        if (client.finishConnect()) {
                            ExchangeInfoMessage msg = GenerateMsgUtils.generateHandshakeReq("test_client");
                            ByteBuffer buffer = ByteBuffer.wrap(clientUtil.serialize(msg));
                            if (client.isConnected()) {
                                client.write(buffer);
                                System.out.println("Sent message: " + msg.getHeader().getReceiver());
                            }
                            client.register(selector, SelectionKey.OP_READ);
                        } else {
                            System.err.println("Failed to establish connection");
                            System.exit(1);
                        }
                    } else if (key.isReadable()) {
                        count +=1;
                        System.out.println(count);
                        System.out.println("Pisya");
                        ByteBuffer buffer = ByteBuffer.allocate(1024 * 50);
                        int numBytesRead = client.read(buffer);
                        if (numBytesRead > 0) {
                            buffer.flip();
                            ExchangeInfoMessage receive = (ExchangeInfoMessage) clientUtil.deserialize(buffer.array());
                            System.out.println("Received response: " + receive.getHeader().getReceiver());
                        }
                    }
                    iterator.remove();
                }
            }
        }
    }
}
