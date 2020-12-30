package com.company.bridge;

import com.company.decorator.Beverage;

public class Lenovo implements Brand {
    @Override
    public String brand() {
        return "联想";
    }
}
