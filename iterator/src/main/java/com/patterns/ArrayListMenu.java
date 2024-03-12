package com.patterns;

import java.util.ArrayList;

import com.patterns.iterator.ArrayListIterator;
import com.patterns.iterator.Iterator;

public class ArrayListMenu {
    ArrayList<String> items = new ArrayList<>();

    public ArrayListMenu() {
        items.add("tostada");
        items.add("pan");
        items.add("panque");
        items.add("pepino");
        items.add("totame");
    }

    ArrayList<String> getItems() {
        return items;
    }

    Iterator createIterator() {
        return new ArrayListIterator(items);
    }
}
