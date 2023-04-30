package com.racerssquad.besthack2023.util;

import com.racerssquad.besthack2023.DTO.proto.ExchangeInfoMessage;
import org.springframework.core.serializer.Deserializer;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.util.Arrays;

@Component
public class CustomDeserializer implements Deserializer<ExchangeInfoMessage> {

    @Override
    public ExchangeInfoMessage deserializeFromByteArray(byte[] serialized)
            throws IOException {
        ExchangeInfoMessage exchangeMessageFromMessage = MessageToExchangeInfoDeserializer.getExchangeMessageFromMessage(serialized);
//        return MessageBuilder.withPayload(exchangeMessageFromMessage).build();
        return exchangeMessageFromMessage;
    }

    @Override
    public ExchangeInfoMessage deserialize(InputStream inputStream) throws IOException {
        ByteBuffer buffer = ByteBuffer.allocate(1024); // выделяем буфер для чтения
        ReadableByteChannel channel = Channels.newChannel(inputStream); // создаем ReadableByteChannel из InputStream

        int bytesRead = channel.read(buffer); // читаем байты в буфер
        byte[] serBytes = Arrays.copyOf(buffer.array(), bytesRead); // копируем прочитанные байты в новый массив

        ExchangeInfoMessage exchangeMessageFromMessage = MessageToExchangeInfoDeserializer.getExchangeMessageFromMessage(serBytes);
//        ExchangeInfoMessage msg = MessageBuilder.withPayload(exchangeMessageFromMessage).build();
        return exchangeMessageFromMessage;
    }
}
