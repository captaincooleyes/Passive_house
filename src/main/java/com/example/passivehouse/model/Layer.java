package com.example.passivehouse.model;

public class Layer {

    public String name;
    public Integer thickness;

    @Override
    public String toString() {
        return "\n" + name + " " + thickness;
    }
}
