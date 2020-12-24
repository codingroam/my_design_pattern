package com.company.decorator;
/*
* 深焙咖啡
* */
public class DarkRoast extends Beverage {

    public DarkRoast() {
        this.des = "DarkRoast 20(元/杯)";
    }

    @Override
    float cost() {
        return 20f;
    }
}
