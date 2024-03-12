package com.patterns;

import com.patterns.pizzaStore.CDMXPizzaStore;
import com.patterns.pizzaStore.GDLPizzaStore;

public class Main {
    public static void main(String[] args) {
        PizzaStore pizzaStore = new CDMXPizzaStore();

        createStore(pizzaStore);
    }

    private static void createStore(PizzaStore pizzaStore) {
        pizzaStore.orderPizza("chesse");
        System.out.println();
        pizzaStore.orderPizza("pepperoni");
    }
}