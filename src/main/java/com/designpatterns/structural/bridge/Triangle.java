package com.designpatterns.structural.bridge;

public class Triangle extends Shape {


    public Triangle(Color color) {
        super(color);
    }

    @Override
    public String applyColor() {
        return color.applyColor() + " Triangle";
    }
}
