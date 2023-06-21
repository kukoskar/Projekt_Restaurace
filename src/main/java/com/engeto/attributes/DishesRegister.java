package com.engeto.attributes;

import java.util.ArrayList;

public class DishesRegister extends ArrayList<Order> {
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("DishesRegister:\n");
        forEach(dish -> {

                result.append("* ").append(dish).append(" -> ").append(dish.getOrderInfo()).append("\n");


        });
        return result.toString();
    }
}


