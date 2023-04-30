package com.racerssquad.besthack2023.util;

import com.racerssquad.besthack2023.DTO.proto.OwnCommand;

import java.util.List;

public class EISSystemInformation {

    private final int id;

    private final String name;

    private final String connectionIP;

    List<OwnCommand> commands;

    public EISSystemInformation(int id, String name, String connectionIP, List<OwnCommand> commands){
        this.id = id;
        this.name = name;
        this.connectionIP = connectionIP;
        this.commands = commands;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getConnectionIP() {
        return connectionIP;
    }

    @Override
    public String toString() {
        return "EISSystemInformation{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", connectionIP='" + connectionIP + '\'' +
                ", commands=" + commands +
                '}';
    }
}
