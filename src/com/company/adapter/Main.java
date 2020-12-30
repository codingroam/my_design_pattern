package com.company.adapter;

public class Main {
    public static void main(String[] args) {
        Duck duck = new MallardDuck();
        duck.quack();
        duck.fly();
        Turkey turkey = new WildTurkey();
        turkey.gobble();
        turkey.fly();

        System.out.println("------------------");

        TurkeyAdapter turkeyAdapter = new TurkeyAdapter(turkey);
        turkeyAdapter.quack();
        turkeyAdapter.fly();
    }
}
