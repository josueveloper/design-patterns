package com.patterns.gumballMachine;

public class GumballMachine {

    private int count;
    private State state;

    private State noCoin = new NoCoin(this);
    private State hasCoin = new HasCoin(this);
    private State triggered = new Triggered(this);
    private State soldOut = new SoldOut(this);

    public GumballMachine() {
        count = 2;
        state = noCoin;
    }

    State getState() {
        return state;
    }

    int getCount() {
        return count;
    }

    void decreaseCount() {
        count--;
    }

    void setState(State state) {
        this.state = state;
    }

    State getNoCoin() {
        return noCoin;
    }

    State getHasCoin() {
        return hasCoin;
    }

    State getTriggered() {
        return triggered;
    }

    State getSoldOut() {
        return soldOut;
    }

    public void insertCoin() {
        state.insertCoin();
    }

    public void retreiveCoin() {
        state.retreiveCoin();
    }

    public void pull() {
        state.pull();
        state.obtainGumball();
    }

}
