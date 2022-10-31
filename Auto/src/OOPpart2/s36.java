package OOPpart2;
//● Доработайте пример с циклом for (слайд 36) - обработайте ситуацию с
//вводом отрицательного числа
//for, foreach
//слайд 36:
//Scanner scanner = new Scanner(System.in);
//System.out.print(“Please enter a number: ”);
//int x = scanner.nextInt();
//int sum = 0;
//for (int i = 0; i <= x; i++) {
//sum += i;}
//System.out.printf(“The sum of all numbers from 0 to %d is %d”, x, sum);

import java.util.Scanner;

public class s36 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int x = scanner.nextInt();
        if (x < 0) {
            x = x * (-1);
        }
        int sum = 0;
        for (int i = 0; i <= x; i++) {
            sum += i;
        }
        System.out.printf("The sum of all numbers from 0 to %d is %d", x, sum);
    }

}
