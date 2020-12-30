package com.company.singleton;

public class Main {
    public static void main(String[] args) {
        LazySingle singleTon = LazySingle.getInstance();
        LazySingle singleTon1 = LazySingle.getInstance();
        System.out.println("LazySingle"+singleTon);
        System.out.println("LazySingle1"+singleTon1);
        HunarySingleton hunarySingleton = HunarySingleton.getInstance();
        HunarySingleton hunarySingleton1 = HunarySingleton.getInstance();
        System.out.println("HunarySingleton"+hunarySingleton);
        System.out.println("HunarySingleton1"+hunarySingleton1);
        DoubleCheck doubleCheck = DoubleCheck.getInstance();
        DoubleCheck doubleCheck1 = DoubleCheck.getInstance();
        System.out.println("DoubleCheck"+doubleCheck);
        System.out.println("DoubleCheck1"+doubleCheck1);

    }
}
