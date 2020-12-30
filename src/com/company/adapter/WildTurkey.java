package com.company.adapter;

public class WildTurkey implements Turkey {
    @Override
    public void gobble() {
        System.out.println("咯咯");
    }

    @Override
    public void fly() {

        System.out.println("火鸡起飞");
    }
}
