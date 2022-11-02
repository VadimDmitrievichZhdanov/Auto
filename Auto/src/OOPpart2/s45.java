package OOPpart2;

import java.util.Scanner;

//● Доработайте пример с оператором if… else (слайд 45) - если пользователь
//вводит значение вне диапазона 0 - 100, вывести сообщение “Введено
//некорректное значение” и попросить повторить ввод (использовать цикл)
//if … else
//слайд 45:
//System.out.print(“Please enter your score: “;
//int score = new Scanner(System.in).nextInt();
//if (score >= 70) {
//System.out.println(“Congrats! You’ve passed the test!”);
//} else {
//System.out.println(“Sorry, you’ve failed the test.”);
//}
public class s45 {
    public static void main(String[] args) {

        System.out.print("Please enter your score: ");
        int score = new Scanner(System.in).nextInt();
        boolean x = false;
        while (!x) {
            if ((score < 0) | (score > 100)) {
                System.out.println("incorrect value, try again");
                score = new Scanner(System.in).nextInt();
                } else {
                x = true;
            }
        }

            if (score >= 70) {
                System.out.println("Congrats! You've passed the test!");
            } else {
                System.out.println("Sorry, you've failed the test.");
            }
        }
    }

