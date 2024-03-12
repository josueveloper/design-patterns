package com.patterns;

public abstract class MenuComponent {
    public void addItem(MenuComponent component) {
        throw new UnsupportedOperationException();
    }

    public abstract void print();
}
