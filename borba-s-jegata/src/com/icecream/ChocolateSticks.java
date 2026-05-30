package com.icecream;

public class ChocolateSticks extends IceCreamDecorator {

    public ChocolateSticks(IceCream iceCream) {
        super(iceCream);
    }

    @Override
    public String getDescription() {
        return iceCream.getDescription() + " + шоколадови пръчици";
    }

    @Override
    public double getPrice() {
        return iceCream.getPrice() + 0.80;
    }
}
