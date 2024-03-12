package com.patterns;

import com.patterns.iterator.ArrayIterator;
import com.patterns.iterator.Iterator;

public class ArrayMenu {
    String[] items = { "arroz", "pescado", "tripas", "seviche" };

    String[] getItems() {
        return items;
    }

    Iterator createIterator() {
        return new ArrayIterator(items);
    }
}
