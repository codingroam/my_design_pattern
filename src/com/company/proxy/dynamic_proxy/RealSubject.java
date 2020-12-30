package com.company.proxy.dynamic_proxy;

public class RealSubject implements Subject {
    @Override
    public void action() {
        System.out.println("我是真实对象");
    }
}
