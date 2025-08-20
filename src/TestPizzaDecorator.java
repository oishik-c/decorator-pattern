import com.decorator.pizza.base.Pizza;
import com.decorator.pizza.classic.*;
import com.decorator.pizza.toppings.*;

public class TestPizzaDecorator {
    public static void main(String[] args) {
//        Creating a vegetarian pizza and adding Mushroom, Onions and Olives
        Pizza pizza = new ClassicVeg();
        pizza = new Mushroom(pizza);
        pizza = new Onion(pizza);
        pizza = new Olive(pizza);
//        Now Printing Description and Price
        System.out.println(pizza.getDesc());
        System.out.println("Total Cost: " + pizza.getPrice().toString() + "\n");

//        Creating a new Non-vegetarian pizza with all the other toppings and extra cheese
        pizza = new ClassicNonVeg();
        pizza = new Tomato(pizza);
        pizza = new Cheese(pizza);
        pizza = new Cheese(pizza);
        pizza = new Chicken(pizza);
        pizza = new Ham(pizza);
//        Now printing Description and Price
        System.out.println(pizza.getDesc());
        System.out.println("Total Cost: " + pizza.getPrice().toString() + "\n");
    }
}
