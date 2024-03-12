package com.patterns;

public class MenuItem extends MenuComponent {
    String name;

    public MenuItem(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println("------- Menu item -> " + name);
    }

}
