package com.decorator.pizza.toppings;

import com.decorator.pizza.base.Pizza;
import com.decorator.pizza.base.PizzaDecorator;

public class Olive extends PizzaDecorator {
    public Olive(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDesc() {
        return pizza.getDesc()+", Olives (Rs. 55)";
    }

    @Override
    public Double getPrice() {
        return pizza.getPrice()+55.0;
    }
}
