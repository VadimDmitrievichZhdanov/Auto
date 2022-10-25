package Aditional_Tasks.Massives;

import java.util.Random;

//1. Дан массив с целыми числами. Вывести в консоль количество положительных и
//        отрицательных чисел в нем
public class Mas1 {
    public static void main(String[] args) {
        Random random = new Random();
        int plus = 0;
        int minus = 0;
        int zero = 0;
        int[] array = new int[10];
        for (int i = 0; i < 10; i++) {
            array[i] = random.nextInt();
            System.out.println(array[i]);
            if (array[i] > 0) {
                plus++;
            } else if (array[i] == 0) {
                zero++;
            } else {
                minus++;
            }
        }
        System.out.println("Polozhitelnih chisel v massive: " + plus);
        System.out.println("Otricatelnih chisel v massive: " + minus);
        System.out.println("Nuley: " + zero);
    }
}

