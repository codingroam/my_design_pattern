package com.company.builder;

public class Car {
    private String tyre;//轮胎
    private String engine;//引擎
    private String fangxiaongpan;//方向盘

    public String getTyre() {
        return tyre;
    }

    public void setTyre(String tyre) {
        this.tyre = tyre;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getFangxiaongpan() {
        return fangxiaongpan;
    }

    public void setFangxiaongpan(String fangxiaongpan) {
        this.fangxiaongpan = fangxiaongpan;
    }

    @Override
    public String toString() {
        return "Car{" +
                "tyre='" + tyre + '\'' +
                ", engine='" + engine + '\'' +
                ", fangxiaongpan='" + fangxiaongpan + '\'' +
                '}';
    }
}
