package com.company.observer;

import java.util.List;

public class BaiduObserver implements Observer {

    private float temperature;
    private float pressure;
    private float humidity;
    private WeatherSubject weatherSubject;

    public BaiduObserver(WeatherSubject weatherSubject) {

        this.weatherSubject = weatherSubject;
    }

    public BaiduObserver() {
    }

    @Override
    public void update() {
        this.temperature = weatherSubject.getTemperature();
        this.humidity = weatherSubject.getHumidity();
        this.pressure = weatherSubject.getPressure();
        display();

    }
    private void display(){
        System.out.println("温度："+temperature);
        System.out.println("湿度："+humidity);
        System.out.println("气压："+pressure);
    }
}
