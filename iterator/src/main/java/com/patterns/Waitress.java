package com.patterns;

import java.util.ArrayList;

import com.patterns.iterator.Iterator;

public class Waitress {
    ArrayMenu arrayMenu = new ArrayMenu();
    String[] menuItems = arrayMenu.getItems();

    ArrayListMenu arrayListMenu = new ArrayListMenu();
    ArrayList<String> menuItemsList = arrayListMenu.getItems();

    public void showAllMenus() {
        // showArrayMenu();
        showItems(arrayMenu.createIterator());
        System.out.println();
        // showArrayListMenu();
        showItems(arrayListMenu.createIterator());
    }

    private void showArrayMenu() {
        for (int i = 0; i < menuItems.length; i++) {
            System.out.println(menuItems[i]);
        }
    }

    private void showArrayListMenu() {
        for (int i = 0; i < menuItemsList.size(); i++) {
            System.out.println(menuItemsList.get(i));
        }
    }

    private void showItems(Iterator iterator) {
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
