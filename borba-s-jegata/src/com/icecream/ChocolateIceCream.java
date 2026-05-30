package com.icecream;

public class ChocolateIceCream implements IceCream {

    @Override
    public String getDescription() {
        return "Шоколадов сладолед";
    }

    @Override
    public double getPrice() {
        return 3.00;
    }
}
