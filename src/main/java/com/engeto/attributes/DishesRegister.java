package com.engeto.attributes;

import java.util.ArrayList;
import java.util.Arrays;

public class DishRegister extends ArrayList<Dish> {
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("AssetsRegister:\n");
        forEach(asset -> result.append("* ").append(asset).append(" -> ").append(asset.getLocation()).append("\n"));
        return result.toString();
    }
}


