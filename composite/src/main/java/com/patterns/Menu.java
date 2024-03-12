package com.patterns;

import java.util.ArrayList;

public class Menu extends MenuComponent {
    String name;
    ArrayList<MenuComponent> items = new ArrayList<>();

    public Menu(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void addItem(MenuComponent component) {
        items.add(component);
    }

    @Override
    public void print() {
        System.out.println("**** Menu -> " + name);
        for (MenuComponent menuComponent : items) {
            menuComponent.print();
        }
        System.out.println();
    }
}
