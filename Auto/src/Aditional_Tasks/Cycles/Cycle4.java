package Aditional_Tasks.Cycles;

import java.util.Scanner;

//4. Пользователь вводит число. Выводим в консоль факториал этого числа
public class Cycle4 {

    static long calculateFactorial(int n){
        long result = 1;
        for (int i = 1; i <=n; i ++){
            result = result*i;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input number (from 0 to 39)");
        System.out.println(calculateFactorial(sc.nextInt()));
    }
}
// TODO: узнать про BigInteger




