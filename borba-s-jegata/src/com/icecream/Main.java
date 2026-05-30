package com.icecream;

public class Main {

    public static void main(String[] args) {

        IceCream iceCream =
                IceCreamFactory.createIceCream("vanilla");

        iceCream = new ChocolateGlaze(iceCream);
        iceCream = new WhippedCream(iceCream);
        iceCream = new ChocolateSticks(iceCream);

        System.out.println(iceCream.getDescription());
        System.out.println(iceCream.getPrice());
    }
}