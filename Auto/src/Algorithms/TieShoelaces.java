package Algorithms;

import java.util.Random;
import java.util.Scanner;

public class TieShoelaces {
    // Класс иммитатор шнуровки обуви
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        boolean CheckYourLegsOnTheButt = random.nextBoolean();
        boolean FindYourShoes = random.nextBoolean();
        int holes;
        int i = 1;
        if (CheckYourLegsOnTheButt == false) {
            System.out.println("Pain! I can't feel my legs!");
        } else if (FindYourShoes == false) {
            System.out.println("I need new shoes!");
        } else {
            System.out.println("It's time to find the shoelaces");
            System.out.println("How many holes?");
            for (holes = scanner.nextInt(); holes > 0; holes--) {
                System.out.println("tie after tie " + i++);
            }
        }
    }
}
