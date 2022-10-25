package Aditional_Tasks.Conditions;

import java.util.Scanner;

public class AT7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Vvedite chislo");
        int number = sc.nextInt();
        if (number == 0) {
            System.out.println("sector nol, vi bankrot");
        }
        else if (number % 2 == 0) {
            System.out.println("Chetnoe");
        } else {
            System.out.println("Nechetnoe");
        }
    }
}
