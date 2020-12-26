package com.company.strategy;

public class ZhiQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("zhizhi叫");
    }
}
