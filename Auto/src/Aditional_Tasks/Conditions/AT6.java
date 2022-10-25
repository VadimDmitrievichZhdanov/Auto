package Aditional_Tasks.Conditions;

import java.util.Scanner;

//6. Пользователь вводит в консоли три числа. Рассчитываем и выводим в консоль сумму
//        наибольшего и наименьшего из них
public class AT6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int big = 0;
        int small = 0;
        System.out.println("Vvedite 3 chisla");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a > b && a > c) {
            big = a;
        } else if (b > a && b > c) {
            big = b;
        } else if (c > a && c > b) {
            big = c;
        }
        if (a < b && a < c) {
            small = a;
        } else if (b < a && b < c) {
            small = b;
        } else if (c < a && c < b) {
            small = c;
        }
        System.out.println(small + big);
    }
}
