package com.company.builder;

public class SubCarABuilder extends CarBuilder {
    @Override
    void buildTyre() {
        car.setTyre("A轮胎");
    }

    @Override
    void buildEngine() {
        car.setEngine("A引擎");

    }

    @Override
    void buildFangxiangpan() {
        car.setFangxiaongpan("A方向盘");

    }
}
