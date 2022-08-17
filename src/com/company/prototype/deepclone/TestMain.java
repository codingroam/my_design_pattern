package com.company.prototype.deepclone;

public class TestMain {


    public static void main(String[] args) throws CloneNotSupportedException {
//        Student wangkai = new Student("wangkai", 25);
//        Student wangkaic = wangkai.clone();
//        System.out.println();

        Student ww = new Student("ww", 99, new Book(100));
        Student clone = ww.deepClone();

        System.out.println();
    }


}
