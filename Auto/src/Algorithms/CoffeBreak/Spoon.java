package Algorithms.CoffeBreak;

public class Spoon {
     {
        int amount = 3;
        int spoon;
        int sugar = 0;
        for (spoon = 1; spoon <= amount; ++spoon)
        {
            System.out.println("до добавления: " + sugar);
            sugar++;
            System.out.println("после добавления: " + sugar);
            System.out.println("Цикл окончен");
        }
        System.out.println("Количество ложек сахара в чашке: " + sugar);
    }
}
