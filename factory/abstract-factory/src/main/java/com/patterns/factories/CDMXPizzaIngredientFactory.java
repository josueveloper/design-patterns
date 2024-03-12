package com.patterns.factories;

import com.patterns.PizzaIngredientFactory;
import com.patterns.ingredients.Cheese;
import com.patterns.ingredients.CheeseMozzarela;
import com.patterns.ingredients.Clams;
import com.patterns.ingredients.ClamsFresh;
import com.patterns.ingredients.Dough;
import com.patterns.ingredients.DoughThin;
import com.patterns.ingredients.Pepperoni;
import com.patterns.ingredients.PepperoniSlice;
import com.patterns.ingredients.Sauce;
import com.patterns.ingredients.SauceMariana;
import com.patterns.ingredients.Veggies;
import com.patterns.ingredients.VeggiesGarlic;
import com.patterns.ingredients.VeggiesMushroom;

public class CDMXPizzaIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Dough createDough() {
        return new DoughThin();
    }

    @Override
    public Sauce createSauce() {
        return new SauceMariana();
    }

    @Override
    public Cheese createCheese() {
        return new CheeseMozzarela();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies[] veggies = { new VeggiesGarlic(), new VeggiesMushroom() };
        return veggies;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new PepperoniSlice();
    }

    @Override
    public Clams createClams() {
        return new ClamsFresh();
    }
}
