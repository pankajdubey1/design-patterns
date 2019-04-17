package com.designpatterns.structural.facade;

public class VegRestaurant implements Hotel {
    @Override
    public String eat() {
        return "Eating Veg";
    }
}
