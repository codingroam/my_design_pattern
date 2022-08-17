package com.company.factory.abstractfactory;

public class HaierFactory implements Factory{
    @Override
    public TV createTV() {
        return new HaierTV();
    }

    @Override
    public Fridge createFridge() {
        return new HaierFridge();
    }
}
