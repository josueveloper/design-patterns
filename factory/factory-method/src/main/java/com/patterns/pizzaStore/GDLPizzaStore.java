package com.patterns.pizzaStore;

import com.patterns.Pizza;
import com.patterns.PizzaStore;
import com.patterns.GDLPizzaTypes.GDLChessePizza;
import com.patterns.GDLPizzaTypes.GDLPepperoniPizza;

public class GDLPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equals("chesse"))
            pizza = new GDLChessePizza();
        else if (type.equals("pepperoni"))
            pizza = new GDLPepperoniPizza();

        return pizza;
    }

}
