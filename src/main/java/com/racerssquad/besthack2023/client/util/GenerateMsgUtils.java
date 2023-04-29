package com.racerssquad.besthack2023.client.util;

import com.racerssquad.besthack2023.DTO.proto.*;

import java.util.List;

public class GenerateMsgUtils {

    public static ExchangeInfoMessage generateHandshakeReq(String senderId) {
        return ExchangeInfoMessage.newBuilder()
                .setHeader(Header.newBuilder()
                        .setMessageNum(Integer.toString(0))
                        .setTimestamp(System.currentTimeMillis() / 1000L)
                        .setSender("test_client")
                        .setReceiver("server")
                )
                .setRequest(Request.newBuilder()
                        .setCommand(MessageEnumsProto.CommandType.ctHandshake)
                        .addAllSupportedCommands(List.of(
                                OwnCommand.newBuilder().setAlias("comand1").addAllParameters(List.of(Parameter.newBuilder().setAlias("param").build())).build()
                        ))
                        .build())
                .build();
    }
}
