package com.racerssquad.besthack2023.util;

import com.racerssquad.besthack2023.DTO.proto.ExchangeInfoMessage;
import org.springframework.core.serializer.Deserializer;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;

import java.io.IOException;
import java.io.InputStream;

public class CustomDeserializer implements Deserializer<Message<ExchangeInfoMessage>> {

    @Override
    public Message<ExchangeInfoMessage> deserializeFromByteArray(byte[] serialized)
            throws IOException {
        ExchangeInfoMessage exchangeMessageFromMessage = MessageToExchangeInfoDeserializer.getExchangeMessageFromMessage(serialized);
        return MessageBuilder.withPayload(exchangeMessageFromMessage).build();
    }

    @Override
    public Message<ExchangeInfoMessage> deserialize(InputStream inputStream) throws IOException {
        byte[] serBytes = inputStream.readAllBytes();
        ExchangeInfoMessage exchangeMessageFromMessage = MessageToExchangeInfoDeserializer.getExchangeMessageFromMessage(serBytes);
        return MessageBuilder.withPayload(exchangeMessageFromMessage).build();
    }
}
