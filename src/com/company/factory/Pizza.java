package com.company.factory;

public class Pizza {
    String name;


    void prepare(){
        System.out.println("准备"+name);

    }
    void bake(){

        System.out.println("烘烤"+name);
    }
    void cut(){

        System.out.println("切分"+name);
    }
}
