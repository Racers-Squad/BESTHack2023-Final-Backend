package com.racerssquad.besthack2023.util;

import com.racerssquad.besthack2023.DTO.CommandRequest;
import com.racerssquad.besthack2023.DTO.proto.*;
import org.springframework.stereotype.Component;

@Component
public class GenerateRequestToExecuteCommand {

    public ExchangeInfoMessage createRequestToExecCommand(String birzhaId, CommandRequest request) {
        return ExchangeInfoMessage.newBuilder()
                .setHeader(Header.newBuilder().setReceiver(birzhaId)
                )
                .setRequest(Request.newBuilder()
                        .setCommandForExec(OwnCommand.newBuilder()
                                .setAlias(Integer.toString(request.getId()))
                                .addAllParameters(request.getArgs().stream()
                                        .map(arg -> {
                                            return Parameter.newBuilder()
                                                    .setAlias(Integer.toString(arg.getId()))
                                                    .setValue(ValueRef.newBuilder()
                                                            .setValue(arg.getValue())
                                                            .build())
                                                    .build();
                                        })
                                        .toList())
                                .build())
                        .build())
                .build();
    }
}
