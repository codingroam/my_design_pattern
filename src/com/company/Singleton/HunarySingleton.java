package com.company.Singleton;

public class HunarySingleton {
    private static HunarySingleton hunarySingleton = new HunarySingleton();
    private HunarySingleton(){

    }
    public static HunarySingleton getInstance(){
        return hunarySingleton;
    }

}
