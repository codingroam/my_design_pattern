package com.company.Singleton;

public class LazySingle {
    public static LazySingle lazySingle;

    private LazySingle() {

    }
    public static LazySingle getInstance(){
        if(lazySingle ==null){
            lazySingle = new LazySingle();;
            return lazySingle;
        }
        return lazySingle;
    }
}
