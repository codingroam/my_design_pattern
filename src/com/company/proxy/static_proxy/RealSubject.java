package com.company.proxy.static_proxy;

public class RealSubject implements Subject {
    @Override
    public void action() {
        System.out.println("---------------------");
        System.out.println("我是真实对象");
        System.out.println("---------------------");
    }
}
