package com.company.builder;

public class SubCarBBuilder extends CarBuilder {
    @Override
    void buildTyre() {
        car.setTyre("B轮胎");
    }

    @Override
    void buildEngine() {

        car.setEngine("B引擎");
    }

    @Override
    void buildFangxiangpan() {

        car.setFangxiaongpan("B方向盘");
    }
}
