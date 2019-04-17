package com.designpatterns.structural.facade;

public class VegNonVegRestaurant implements Hotel {
    @Override
    public String eat() {
        return "Eating Veg and NonVeg both";
    }
}
