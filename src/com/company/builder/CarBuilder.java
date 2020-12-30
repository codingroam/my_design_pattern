package com.company.builder;

public abstract class CarBuilder {
    Car car = new Car();
    abstract void buildTyre();
    abstract void buildEngine();
    abstract void buildFangxiangpan();

    Car getCar(){
        return car;
    }
}
