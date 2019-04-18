package com.designpatterns.structural.bridge;

public class GreenColor implements Color {
    @Override
    public String applyColor() {
        System.out.println("GREEN");
        return "GREEN";
    }
}
