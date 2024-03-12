package com.patterns;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {
    List<Observer> observers = new ArrayList<>();

    private int temperature = 5;
    private int humidity = 10;
    private int pressure = 35;

    @Override
    public void register(Observer o) {
        observers.add(o);
    }

    @Override
    public void unregister(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(o -> o.update());
    }

    public void measurementsChanched() {
        temperature++;
        humidity++;
        pressure++;
        notifyObservers();
    }

    public int getTemperature() {
        return temperature;
    }

    public int getHumidity() {
        return humidity;
    }

    public int getPressure() {
        return pressure;
    }
}
