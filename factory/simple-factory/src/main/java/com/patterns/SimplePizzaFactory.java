package com.patterns;

public class SimplePizzaFactory {
    public Pizza createPizza(String sucursal, String type) {
        Pizza pizza = null;

        if (sucursal.equals("CDMX")) {
            if (type.equals("chessecintamales"))
                pizza = new ChessePizza();
            else if (type.equals("pepperonicontamales"))
                pizza = new PepperoniPizza();
        } else if (sucursal.equals("gdl")) {
            if (type.equals("chessecontortaahogada"))
                pizza = new ChessePizza();
            else if (type.equals("pepperonicontortas"))
                pizza = new PepperoniPizza();
        }

        return pizza;
    }
}
