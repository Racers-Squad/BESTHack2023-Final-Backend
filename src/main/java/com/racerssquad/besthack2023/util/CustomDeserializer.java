package com.racerssquad.besthack2023.util;

import org.springframework.core.serializer.Deserializer;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

public class CustomDeserializer implements Deserializer<Message<String>> {

    @Override
    public Message<String> deserializeFromByteArray(byte[] serialized) throws IOException {
        String payload = new String(serialized, StandardCharsets.UTF_8);
        return MessageBuilder.withPayload(payload).build();
    }

    @Override
    public Message<String> deserialize(InputStream inputStream) throws IOException {
        String payload = new String(inputStream.readAllBytes(), StandardCharsets.UTF_8);
        return MessageBuilder.withPayload(payload).build();
    }
}
