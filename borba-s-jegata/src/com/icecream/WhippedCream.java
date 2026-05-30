package com.icecream;

public class WhippedCream extends IceCreamDecorator {

    public WhippedCream(IceCream iceCream) {
        super(iceCream);
    }

    @Override
    public String getDescription() {
        return iceCream.getDescription() + " + сметана";
    }

    @Override
    public double getPrice() {
        return iceCream.getPrice() + 0.90;
    }
}
