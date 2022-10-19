package Algorithms.CoffeBreak;

public class Boiler extends Water {

    static int waterInTheCup = 0;


    public static int waterInTheCup() {
        for (int steam = 100; waterTemperature < steam - 1; waterTemperature++) ;
        waterInTheCup = waterTemperature;
        return waterInTheCup;
    }

}

