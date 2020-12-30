package com.company.template;

public class Main {
    public static void main(String[] args) {
        CaffeineBeverage caffeineBeverage = new Tea();
        caffeineBeverage.prepareRecipe();
        System.out.println("===============");

        CaffeineBeverage caffeineBeverage1 = new Coffee();
        caffeineBeverage1.prepareRecipe();
    }
}
