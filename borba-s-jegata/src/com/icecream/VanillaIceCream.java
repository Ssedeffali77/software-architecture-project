package com.icecream;

public class VanillaIceCream implements IceCream {

    @Override
    public String getDescription() {
        return "Ванилов сладолед";
    }

    @Override
    public double getPrice() {
        return 2.50;
    }
}