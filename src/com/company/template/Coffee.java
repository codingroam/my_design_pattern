package com.company.template;

public class Coffee extends CaffeineBeverage {
    @Override
    protected void addCondiments() {
        System.out.println("添加牛奶和糖");
    }

    @Override
    protected void brew() {
        System.out.println("冲泡咖啡");

    }
}
