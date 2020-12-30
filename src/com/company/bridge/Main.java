package com.company.bridge;

public class Main {
    public static void main(String[] args) {
        Computer computer = new Laptop(new Dell());
        computer.sale();

        Computer computer1 = new SmartPhone(new Lenovo());
        computer1.sale();
    }
}
