package com.patterns.gumballMachine;

public class SoldOut implements State {

    GumballMachine gumballMachine;

    public SoldOut(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertCoin() {
        System.out.println("No more gumballs");
    }

    @Override
    public void retreiveCoin() {
        System.out.println("There's no coin");
    }

    @Override
    public void pull() {
        System.out.println("No more gumballs");
    }

    @Override
    public void obtainGumball() {
        System.out.println("que nooo");
    }

}
