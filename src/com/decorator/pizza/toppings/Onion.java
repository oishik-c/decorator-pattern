package com.decorator.pizza.toppings;

import com.decorator.pizza.base.Pizza;
import com.decorator.pizza.base.PizzaDecorator;

public class Onion extends PizzaDecorator {
    public Onion(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDesc() {
        return pizza.getDesc() + ", Onions (Rs. 20)";
    }

    @Override
    public Double getPrice() {
        return pizza.getPrice() + 20.0;
    }
}
