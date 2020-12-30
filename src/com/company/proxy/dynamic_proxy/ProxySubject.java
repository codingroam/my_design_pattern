package com.company.proxy.dynamic_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxySubject implements InvocationHandler {

    private Subject subject;
    public ProxySubject(Subject subject) {
        this.subject = subject;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("代理前");
        Object invoke = method.invoke(subject, args);
        System.out.println("代理后");
        return invoke;
    }
}
