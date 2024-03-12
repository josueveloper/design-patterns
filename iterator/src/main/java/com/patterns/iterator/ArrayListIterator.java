package com.patterns.iterator;

import java.util.ArrayList;

public class ArrayListIterator implements Iterator {
    ArrayList<String> array;
    int pos = 0;

    public ArrayListIterator(ArrayList<String> array) {
        this.array = array;
    }

    @Override
    public boolean hasNext() {
        return pos < array.size();
    }

    @Override
    public String next() {
        return array.get(pos++);
    }

}
