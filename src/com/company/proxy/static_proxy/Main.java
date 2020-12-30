package com.company.proxy.static_proxy;

public class Main {
    public static void main(String[] args) {
        Subject subject = new ProxySubject();
        subject.action();
    }
}
