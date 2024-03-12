package com.patterns;

import com.patterns.pizzaStore.CDMXPizzaStore;
import com.patterns.pizzaStore.GDLPizzaStore;

// import com.patterns.pizzaStore.GDLPizzaStore;

public class Main {
    public static void main(String[] args) {
        PizzaStore pizzaStore = new CDMXPizzaStore();

        pizzaStore.orderPizza("chesse");
        System.out.println();
        pizzaStore.orderPizza("pepperoni");
    }
}