package com.company.decorator;

public class Milk extends Decorator {

    private Beverage beverage;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDes() {
        return beverage.getDes()+",Milk (3元/份)";
    }

    @Override
    float cost() {
        return beverage.cost()+3f;
    }
}
