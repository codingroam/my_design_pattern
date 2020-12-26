package com.company.strategy;

public class Main {
    public static void main(String[] args) {
        Duck duck = new ModelDuck();
        duck.setFlyBehavior(new FlyNoWay());
        duck.setQuackBehavior(new ZhiQuack() );
        duck.display();
        duck.performFly();
        duck.performQuack();
        System.out.println("---------------------");

        Duck duck1 = new GreenHeadDuck();
        duck1.setFlyBehavior(new FlyWithWings());
        duck1.setQuackBehavior(new GuaQuack());
        duck1.display();
        duck1.performFly();
        duck1.performQuack();
    }
}
