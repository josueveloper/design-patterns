package com.patterns.pizzaStore;

import com.patterns.Pizza;
import com.patterns.PizzaStore;
import com.patterns.CDMXPizzaTypes.CDMXChessePizza;
import com.patterns.CDMXPizzaTypes.CDMXPepperoniPizza;

public class CDMXPizzaStore extends PizzaStore {

    public Pizza orderPizza(String type) {
        Pizza pizza = null;

        pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equals("chesse"))
            pizza = new CDMXChessePizza();
        else if (type.equals("pepperoni"))
            pizza = new CDMXPepperoniPizza();

        return pizza;
    }

}
