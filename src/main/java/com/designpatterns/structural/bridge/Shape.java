package com.designpatterns.structural.bridge;

abstract public class Shape {

    protected Color color;

    public Shape(Color color) {
        this.color = color;
    }

    abstract public String applyColor();
}
