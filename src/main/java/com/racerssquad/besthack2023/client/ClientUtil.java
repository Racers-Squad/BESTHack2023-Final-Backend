package com.racerssquad.besthack2023.client;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;

public class ClientUtil {

    public Object receive(SocketChannel socket, ByteBuffer buffer) throws IOException {
        try {
            socket.read(buffer);
            return deserialize(buffer.array());
        } catch (ClassNotFoundException e) {
            System.out.println("Class Cast Exception");
            return null;
        }
    }

    public byte[] serialize(Serializable serializable) throws IOException {
        try (ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream)) {
            objectOutputStream.writeObject(serializable);
            return byteArrayOutputStream.toByteArray();
        }
    }

    public Object deserialize(byte[] bytes) throws IOException, ClassNotFoundException {
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new ByteArrayInputStream(bytes))) {
            return objectInputStream.readObject();
        }
    }
}
