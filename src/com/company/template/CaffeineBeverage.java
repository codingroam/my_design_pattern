package com.company.template;

public abstract  class CaffeineBeverage {
    final void  prepareRecipe(){
        boilWater();
        brew();
        pourInCup();
        addCondiments();

    }

    protected abstract void addCondiments();

    private void pourInCup() {
        System.out.println("倒入杯子");
    }

    protected abstract void brew();


    private void boilWater() {
        System.out.println("煮沸水");
    }
}
