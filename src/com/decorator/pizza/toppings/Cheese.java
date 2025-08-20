package com.decorator.pizza.toppings;

import com.decorator.pizza.base.Pizza;
import com.decorator.pizza.base.PizzaDecorator;

public class Cheese extends PizzaDecorator {
    public Cheese(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDesc() {
        return pizza.getDesc()+", Cheese (Rs. 30)";
    }

    @Override
    public Double getPrice() {
        return pizza.getPrice() + 30.0;
    }
}
