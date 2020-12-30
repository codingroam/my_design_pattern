package com.company.singleton;

public class HunarySingleton {
    private static HunarySingleton hunarySingleton = new HunarySingleton();
    private HunarySingleton(){

    }
    public static HunarySingleton getInstance(){
        return hunarySingleton;
    }

}
