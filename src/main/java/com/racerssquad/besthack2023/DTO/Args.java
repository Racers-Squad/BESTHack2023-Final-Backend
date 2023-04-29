package com.racerssquad.besthack2023.DTO;

public class Args {
    private int id;
    private String name;
    private String value;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Args(int id, String name, String value) {
        this.id = id;
        this.name = name;
        this.value = value;
    }
}
