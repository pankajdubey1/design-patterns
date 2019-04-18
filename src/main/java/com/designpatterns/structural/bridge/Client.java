package com.designpatterns.structural.bridge;

public class Client {

    public static void main(String[] args) {
        Color color1 = new GreenColor();
        Color color2 = new RedColor();
        Shape shape = new Triangle(color1);
        shape.applyColor();
        shape = new Triangle(color2);
        shape.applyColor();


        // Two Complete different hierarchy
        // 1. Shape -> Triangle
        // 2. Color -> RedColor
        // We are bridging the both
    }
}
