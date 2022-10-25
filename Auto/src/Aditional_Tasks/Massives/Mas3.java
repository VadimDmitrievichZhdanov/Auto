package Aditional_Tasks.Massives;

import java.util.Random;

//3. Дан массив с целыми числами. Вывести в консоль сумму четных элементов (четные
//        значения)
public class Mas3 {
    public static void main(String[] args) {
        Random random = new Random();
        int chet = 0;

        int[] array = new int[10];
        for (int i = 0; i < 10; i++) {
            array[i] = random.nextInt(100);
            System.out.println(array[i]);
            if (array[i] % 2 == 0) {
                chet = chet + array[i];
            }
        }

        System.out.println("Summa chetnih elementov: " + chet);
    }

}
