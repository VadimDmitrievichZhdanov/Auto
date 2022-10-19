package Algorithms.CoffeBreak;

public class CoffeeBreak extends Cup {

    public static void main(String[] args) {
        System.out.println(Cup.tellAboutCup());
        System.out.println("Температура воды: " + Boiler.waterInTheCup());
        System.out.println("Сорт этого кофе: " + randomSort.getSort());
    }
}

