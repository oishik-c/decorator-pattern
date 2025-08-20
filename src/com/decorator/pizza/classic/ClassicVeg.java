package com.decorator.pizza.classic;

import com.decorator.pizza.base.Pizza;

public class ClassicVeg implements Pizza{
    @Override
    public String getDesc() {
        return "Classic Vegetarian Pizza (Rs. 250)";
    }

    @Override
    public Double getPrice() {
        return 250.0;
    }
}
