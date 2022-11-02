package Additional_Tasks.Conditions;

import java.util.Scanner;

// 2. Пользователь вводит в консоли два числа, выводим сообщение “первое число
//        больше/меньше, чем второе” в зависимости от результата их сравнения
public class AT2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the first number");
        int x = scanner.nextInt();
        System.out.println("Input the second number");
        int y = scanner.nextInt();
        if (x > y) {
            System.out.println("The first number is greater than second");
        } else if (x == y) {
            System.out.println("They are equals");
        }
        else {
            System.out.println("The second number is greater than first");
        }
    }
}