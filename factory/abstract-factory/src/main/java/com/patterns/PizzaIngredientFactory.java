package com.patterns;

import com.patterns.ingredients.Cheese;
import com.patterns.ingredients.Clams;
import com.patterns.ingredients.Dough;
import com.patterns.ingredients.Pepperoni;
import com.patterns.ingredients.Sauce;
import com.patterns.ingredients.Veggies;

public interface PizzaIngredientFactory {
    public Dough createDough();

    public Sauce createSauce();

    public Cheese createCheese();

    public Veggies[] createVeggies();

    public Pepperoni createPepperoni();

    public Clams createClams();
}
