package com.racerssquad.besthack2023.util;

import com.racerssquad.besthack2023.DTO.proto.ExchangeInfoMessage;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class MessageToExchangeInfoDeserializer {

    public static ExchangeInfoMessage getExchangeMessageFromMessage(byte [] serBytes) {
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new ByteArrayInputStream(serBytes))) {
            return (ExchangeInfoMessage) objectInputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
