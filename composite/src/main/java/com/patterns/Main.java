package com.patterns;

public class Main {
    public static void main(String[] args) {
        Waitress waitress = new Waitress();
        MenuComponent allMenus = fillMenus();

        waitress.showMenus(allMenus);
    }

    private static MenuComponent fillMenus() {
        MenuComponent lonches = new Menu("Lonches");
        lonches.addItem(new MenuItem("Pierna"));
        lonches.addItem(new MenuItem("Frijoles"));

        MenuComponent seven = new Menu("Seven");
        seven.addItem(new MenuItem("Principe"));
        MenuComponent cafes = new Menu("Cafes");
        cafes.addItem(new MenuItem("Moca"));
        cafes.addItem(new MenuItem("Churro"));
        seven.addItem(cafes);

        MenuComponent ensaladas = new Menu("Ensaladas");
        ensaladas.addItem(new MenuItem("Atun"));
        ensaladas.addItem(new MenuItem("Frijoles"));

        MenuComponent allMenus = new Menu("All menus");
        allMenus.addItem(lonches);
        allMenus.addItem(seven);
        allMenus.addItem(ensaladas);

        return allMenus;
    }
}