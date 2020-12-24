package com.company.observer;

public class Main {
    public static void main(String[] args) {
        WeatherSubject weatherSubject = new WeatherSubject();
        weatherSubject.addObserver(new BaiduObserver(weatherSubject));
        weatherSubject.publishSubject(20f,100f,900f);
        weatherSubject.notifyObserver();
    }
}
