package com.company.factory.abstractfactory;

public class Test {
    public static void main(String[] args) throws Exception {
        Factory factory = (Factory)Class.forName("com.company.factory.abstractfactory.HaierFactory").newInstance();
        TV tv = factory.createTV();
        Fridge fridge = factory.createFridge();
        tv.display();
        fridge.display();
    }
}
