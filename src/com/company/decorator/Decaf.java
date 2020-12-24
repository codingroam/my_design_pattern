package com.company.decorator;

public class Decaf extends Beverage {

    public Decaf() {
        this.des = "Decaf 30(元/杯)";
    }

    @Override
    float cost() {
        return 30f;
    }
}
