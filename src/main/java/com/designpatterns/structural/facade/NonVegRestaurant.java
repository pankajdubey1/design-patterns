package com.designpatterns.structural.facade;

public class NonVegRestaurant implements Hotel {
    @Override
    public String eat() {
        return "Eating NonVeg";
    }
}
