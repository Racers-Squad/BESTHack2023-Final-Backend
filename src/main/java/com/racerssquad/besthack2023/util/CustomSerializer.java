package com.racerssquad.besthack2023.util;

import com.racerssquad.besthack2023.DTO.proto.ExchangeInfoMessage;
import org.springframework.core.serializer.Serializer;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

@Component
public class CustomSerializer implements Serializer<Message<ExchangeInfoMessage>> {

    @Override
    public void serialize(Message<ExchangeInfoMessage> object, OutputStream outputStream) throws IOException {
        try (ByteArrayOutputStream bos = new ByteArrayOutputStream();
             ObjectOutputStream oos = new ObjectOutputStream(bos)){
            ExchangeInfoMessage payload = object.getPayload();
            oos.writeObject(payload);
            outputStream.write(bos.toByteArray());
        }
    }

    @Override
    public byte[] serializeToByteArray(Message<ExchangeInfoMessage> object) throws IOException {
        return Serializer.super.serializeToByteArray(object);
    }
}
