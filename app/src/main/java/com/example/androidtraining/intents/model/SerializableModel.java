package com.example.androidtraining.intents.model;

import java.io.Serializable;

public class SerializableModel implements Serializable {

    String name;

    public SerializableModel() {

    }

    public SerializableModel(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}