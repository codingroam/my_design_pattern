package com.company.proxy.static_proxy;

public class ProxySubject implements Subject {
    private Subject subject;
    public ProxySubject() {
        this.subject = new RealSubject();
    }

    @Override
    public void action() {
        System.out.println("--------------------");
        System.out.println("我是代理对象");
        subject.action();
        System.out.println("我是代理对象");
        System.out.println("--------------------");
    }
}
