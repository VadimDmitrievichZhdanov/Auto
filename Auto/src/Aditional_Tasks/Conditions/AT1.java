package Aditional_Tasks.Conditions;

import java.util.Scanner;

//1. Пользователь вводит в консоли число. Если оно больше 10, выдаем в консоли сообщение
//        “Число больше десяти”, если меньше – “Число меньше десяти”
public class AT1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the number");
        int impNumber = scanner.nextInt();
        if (impNumber > 10) {
            System.out.println("This number is greater than ten");
        } else if (impNumber == 10) {
            System.out.println("The number is ten");
        } else {
            System.out.println("This number is less than ten");
        }
    }
}

