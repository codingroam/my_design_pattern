package com.company.decorator;

public class Main {
    public static void main(String[] args) {
        Beverage beverage = new DarkRoast();
        beverage = new Milk(beverage);
        beverage = new Soy(beverage);
        beverage = new Soy(beverage);
        System.out.println(beverage.getDes());
        System.out.println("总价："+beverage.cost());



    }
}
