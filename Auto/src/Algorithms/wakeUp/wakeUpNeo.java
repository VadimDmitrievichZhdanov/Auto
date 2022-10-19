package Algorithms.wakeUp;

import java.util.Random;

public class wakeUpNeo {

    // Класс в котором можно узнать жив ли ты ещё и вовремя ли ты проснулся.
    public static void main(String[] args) {
        Random random = new Random();
        boolean alive = random.nextBoolean();
        int time = random.nextInt(24);
        if (!alive) {
            System.out.println("You are dead");
        } else {
            System.out.println("You are alive");

            if (time > 9) {
                System.out.println("By the way, you overslept! It's " + time + "o'clock");

            }
        }
    }
}

