package com.patterns;

import com.patterns.gumballMachine.GumballMachine;

public class Main {
    public static void main(String[] args) {
        GumballMachine gumballMachine = new GumballMachine();

        gumballMachine.insertCoin();
        gumballMachine.insertCoin();

        gumballMachine.retreiveCoin();
        gumballMachine.retreiveCoin();

        gumballMachine.pull();
        gumballMachine.pull();

        System.out.println("------------");

        gumballMachine.insertCoin();
        gumballMachine.pull();
        gumballMachine.insertCoin();
        gumballMachine.retreiveCoin();

        System.out.println("------------");

        gumballMachine.insertCoin();
        gumballMachine.pull();

        System.out.println("------------");

        gumballMachine.insertCoin();
        gumballMachine.pull();
    }
}