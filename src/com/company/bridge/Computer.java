package com.company.bridge;

public abstract class Computer {
    Brand brand;

    public Computer(Brand brand) {
        this.brand = brand;
    }
    abstract String type();
    void  sale(){
        System.out.println("我们出售的是"+brand.brand()+this.type()+"电脑");
    }
}
