package com.company.decorator;

/*抽象饮料类*/
public abstract class Beverage {
    public String des;

    public String getDes() {
        return des;
    }
    abstract float cost();
}
