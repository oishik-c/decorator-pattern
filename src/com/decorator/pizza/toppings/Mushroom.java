package com.decorator.pizza.toppings;

import com.decorator.pizza.base.Pizza;
import com.decorator.pizza.base.PizzaDecorator;

public class Mushroom extends PizzaDecorator {
    public Mushroom(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDesc() {
        return pizza.getDesc()+", Mushrooms (Rs. 60)";
    }

    @Override
    public Double getPrice() {
        return pizza.getPrice()+60.0;
    }
}
