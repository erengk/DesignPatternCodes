package org.example._2_observerPattern;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);

        weatherData.setMeasurements(28, 65, 1013);
        weatherData.setMeasurements(22, 70, 1012);
        weatherData.setMeasurements(26, 90, 1011);
    }
}

