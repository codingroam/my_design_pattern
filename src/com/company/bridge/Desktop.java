package com.company.bridge;

public class Desktop extends Computer {

    public Desktop(Brand brand) {
        super(brand);
    }

    @Override
    String type() {
        return "台式";
    }
}
