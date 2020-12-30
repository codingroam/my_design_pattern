package com.company.template;

public class Tea extends CaffeineBeverage {
    @Override
    protected void addCondiments() {
        System.out.println("添加柠檬");
    }

    @Override
    protected void brew() {

        System.out.println("冲泡茶叶");
    }
}
