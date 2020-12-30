package com.company.builder;

public class Main {
    public static void main(String[] args) {
        CarBuilder carBuilder = new SubCarABuilder();
        Employee_Director employee_director = new Employee_Director();
        employee_director.setCarBuilder(carBuilder);
        Car car = employee_director.construct();
        System.out.println(car.toString());
    }
}
