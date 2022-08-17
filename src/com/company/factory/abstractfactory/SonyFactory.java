package com.company.factory.abstractfactory;

public class SonyFactory implements Factory{
    @Override
    public TV createTV() {
        return new SonyTV();
    }

    @Override
    public Fridge createFridge() {
        return new SonyFridge();
    }
}
