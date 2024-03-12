package com.patterns;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

import com.patterns.adapters.IteratorAdapter;
import com.patterns.adapters.TurkeyAdapter;
import com.patterns.impl.NormalDuck;
import com.patterns.impl.NormalTurkey;
import com.patterns.interfaces.Duck;
import com.patterns.interfaces.Turkey;

public class Main {
    public static void main(String[] args) {

        // Duck duck = new NormalDuck();
        // duck.quack();
        // duck.fly();
        // System.out.println();
        // System.out.println();

        // Turkey turkey = new NormalTurkey();
        // turkey.gobble();
        // turkey.fly();
        // System.out.println();
        // System.out.println();

        // TurkeyAdapter adapter = new TurkeyAdapter(turkey);
        // Duck duck2 = adapter;
        // duck2.quack();
        // duck2.fly();

        Vector<Integer> vector = new Vector<>();
        vector.add(5);
        vector.add(6);
        vector.add(7);
        vector.add(4);
        vector.add(1);

        Enumeration<Integer> enumeration = vector.elements();

        IteratorAdapter iteratorAdapter = new IteratorAdapter(enumeration);
        showIteration(iteratorAdapter);

    }

    private static void showIteration(Iterator iterator) {
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}