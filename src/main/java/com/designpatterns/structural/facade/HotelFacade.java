package com.designpatterns.structural.facade;

public class HotelFacade {

    public String findRestaurant(Type type) {
        String response = null;
        switch (type) {
            case VEG:
                response = new VegRestaurant().eat();
                break;
            case NONVEG:
                response = new NonVegRestaurant().eat();
                break;
            case BOTH:
                response = new VegNonVegRestaurant().eat();
                break;
        }
        return response;
    }
}
