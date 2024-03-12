package com.patterns;

public class CurrentCondition implements Observer {
    WeatherData weatherData;

    public CurrentCondition(WeatherData weatherData) {
        this.weatherData = weatherData;
    }

    @Override
    public void update() {
        System.out.println("Observer: ");
        System.out.println(weatherData.getTemperature() + " " + weatherData.getHumidity());
    }
}
