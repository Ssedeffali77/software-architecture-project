package com.icecream;

public class IceCreamFactory {

    public static IceCream createIceCream(String type) {

        if (type.equalsIgnoreCase("vanilla")) {
            return new VanillaIceCream();
        }

        if (type.equalsIgnoreCase("chocolate")) {
            return new ChocolateIceCream();
        }

        if (type.equalsIgnoreCase("strawberry")) {
            return new StrawberryIceCream();
        }

        throw new IllegalArgumentException("Невалиден сладолед!");
    }
}
