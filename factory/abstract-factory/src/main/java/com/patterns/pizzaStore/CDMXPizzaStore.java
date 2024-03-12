package com.patterns.pizzaStore;

import com.patterns.Pizza;
import com.patterns.PizzaIngredientFactory;
import com.patterns.PizzaStore;
import com.patterns.factories.CDMXPizzaIngredientFactory;
import com.patterns.factories.GDLPizzaIngredientFactory;
import com.patterns.pizzas.CheesePizza;
import com.patterns.pizzas.PepperoniPizza;

public class CDMXPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new CDMXPizzaIngredientFactory();

        if (type.equals("chesse")) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("Pizza de queso con queso");
        } else if (type.equals("pepperoni")) {
            pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName("Pizza de queso sin queso y con peperoni");
        }

        return pizza;
    }

}
