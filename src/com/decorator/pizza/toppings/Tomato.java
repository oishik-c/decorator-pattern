package com.decorator.pizza.toppings;

import com.decorator.pizza.base.Pizza;
import com.decorator.pizza.base.PizzaDecorator;

public class Tomato extends PizzaDecorator {
    public Tomato(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDesc() {
        return pizza.getDesc()+", Tomatoes (Rs. 20)";
    }

    @Override
    public Double getPrice() {
        return pizza.getPrice()+20.0;
    }
}
