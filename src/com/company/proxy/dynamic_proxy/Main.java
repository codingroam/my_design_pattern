package com.company.proxy.dynamic_proxy;

import java.lang.reflect.Proxy;

public class Main {
    public static void main(String[] args) {
        Subject subject = new RealSubject();
        Subject proxyInstance = (Subject)Proxy.newProxyInstance(Subject.class.getClassLoader(), new Class[]{Subject.class}, new ProxySubject(subject));
        proxyInstance.action();
    }
}
