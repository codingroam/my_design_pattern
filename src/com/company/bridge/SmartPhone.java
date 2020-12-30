package com.company.bridge;

public class SmartPhone extends Computer {
    public SmartPhone(Brand brand) {
        super(brand);
    }

    @Override
    String type() {
        return "智能手机";
    }
}
