package com.patterns;

public class PizzaStore {
    SimplePizzaFactory factory = new SimplePizzaFactory();

    public Pizza orderPizza(String sucursal, String type) {
        Pizza pizza = factory.createPizza(sucursal, type);
        ///////
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }
}
