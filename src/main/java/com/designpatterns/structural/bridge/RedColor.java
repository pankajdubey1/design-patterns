package com.designpatterns.structural.bridge;

public class RedColor implements Color {
    @Override
    public String applyColor() {
        System.out.println("RED");
        return "RED";
    }
}
