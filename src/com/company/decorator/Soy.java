package com.company.decorator;

public class Soy extends Decorator {
    private Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDes() {
        return beverage.getDes()+",Soy (5元/份)";
    }

    @Override
    float cost() {
        return beverage.cost()+5f;
    }
}
