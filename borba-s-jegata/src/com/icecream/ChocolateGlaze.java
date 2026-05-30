package com.icecream;

public class ChocolateGlaze extends IceCreamDecorator {

    public ChocolateGlaze(IceCream iceCream) {
        super(iceCream);
    }

    @Override
    public String getDescription() {
        return iceCream.getDescription() + " + шоколадова глазура";
    }

    @Override
    public double getPrice() {
        return iceCream.getPrice() + 1.20;
    }
}