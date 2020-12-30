package com.company.bridge;

public class Laptop extends Computer {
    public Laptop(Brand brand) {
        super(brand);
    }

    @Override
    String type() {
        return "笔记本";
    }
}
