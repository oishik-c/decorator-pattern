package com.decorator.pizza.toppings;

import com.decorator.pizza.base.Pizza;
import com.decorator.pizza.base.PizzaDecorator;

public class Ham extends PizzaDecorator {
    public Ham(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDesc() {
        return pizza.getDesc() + ", Ham (Rs. 90)";
    }

    @Override
    public Double getPrice() {
        return pizza.getPrice() + 90.0;
    }
}
