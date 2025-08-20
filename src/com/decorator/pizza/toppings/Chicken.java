package com.decorator.pizza.toppings;

import com.decorator.pizza.base.Pizza;
import com.decorator.pizza.base.PizzaDecorator;

public class Chicken extends PizzaDecorator {
    public Chicken(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDesc() {
        return pizza.getDesc() + ", Chicken (Rs. 75)";
    }

    @Override
    public Double getPrice() {
        return pizza.getPrice() + 75.0;
    }
}
