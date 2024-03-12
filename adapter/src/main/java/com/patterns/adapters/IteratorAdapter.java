package com.patterns.adapters;

import java.util.Enumeration;
import java.util.Iterator;

public class IteratorAdapter implements Iterator {

    Enumeration enumeration;

    public IteratorAdapter(Enumeration enumeration) {
        this.enumeration = enumeration;
    }

    @Override
    public boolean hasNext() {
        return enumeration.hasMoreElements();
    }

    @Override
    public Object next() {
        return enumeration.nextElement();
    }

}
