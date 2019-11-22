package com.models;

import java.io.Serializable;

public class Message implements Serializable {
    private long id;
    private String data;

    public Message() {
    }

    public Message(String data) {
        this.data = data;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
