package com.company.strategy;

public class GuaQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("guagua叫");
    }
}
