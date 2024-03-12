package com.patterns.pizzas;

import com.patterns.Pizza;
import com.patterns.PizzaIngredientFactory;

public class PepperoniPizza extends Pizza {
    PizzaIngredientFactory ingredientFactory;

    public PepperoniPizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("preparing " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
        // veggies = ingredientFactory.createVeggies();
        // clams = ingredientFactory.createClams();
        pepperoni = ingredientFactory.createPepperoni();
    }
}
