package com.patterns.iterator;

public class ArrayIterator implements Iterator {
    String[] array;
    int pos = 0;

    public ArrayIterator(String[] array) {
        this.array = array;
    }

    @Override
    public boolean hasNext() {
        return pos < array.length && array[pos] != null;
    }

    @Override
    public String next() {
        return array[pos++];
    }

}
