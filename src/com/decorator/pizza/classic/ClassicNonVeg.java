package com.decorator.pizza.classic;

import com.decorator.pizza.base.Pizza;

public class ClassicNonVeg implements Pizza {
    @Override
    public String getDesc() {
        return "Classic Non Vegetarian Pizza (Rs. 300)";
    }

    @Override
    public Double getPrice() {
        return 300.0;
    }
}
