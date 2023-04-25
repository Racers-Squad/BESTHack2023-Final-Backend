package com.racerssquad.besthack2023.DTO;

public class EISRequest {

    private String name;
    private int delay;

    public EISRequest(String name, int delay) {
        this.delay = delay;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDelay() {
        return delay;
    }

    public void setDelay(int delay) {
        this.delay = delay;
    }
}
