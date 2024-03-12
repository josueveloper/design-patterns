package com.patterns;

public class Main {
    public static void main(String[] args) {
        WeatherData subject = new WeatherData();
        Observer observer = new CurrentCondition(subject);

        subject.register(observer);

        subject.measurementsChanched();
        subject.measurementsChanched();

        subject.measurementsChanched();
    }
}