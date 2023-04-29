package com.racerssquad.besthack2023.DTO;

import java.util.ArrayList;

public class CommandRequest {
    private int id;
    private ArrayList<Args> args;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Args> getArgs() {
        return args;
    }

    public void setArgs(ArrayList<Args> args) {
        this.args = args;
    }

    public CommandRequest(int id, ArrayList<Args> args) {
        this.id = id;
        this.args = args;
    }
}
