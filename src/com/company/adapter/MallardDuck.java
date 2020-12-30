package com.company.adapter;

public class MallardDuck implements Duck {
    @Override
    public void quack() {
        System.out.println("呱呱");
    }

    @Override
    public void fly() {
        System.out.println("鸭子起飞");

    }
}
