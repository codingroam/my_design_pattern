package com.company.builder;

public class Employee_Director {
    private CarBuilder carBuilder;

    public void setCarBuilder(CarBuilder carBuilder) {
        this.carBuilder = carBuilder;
    }

    public Car construct(){
        carBuilder.buildTyre();
        carBuilder.buildEngine();
        carBuilder.buildFangxiangpan();
        return carBuilder.getCar();
    }
}
