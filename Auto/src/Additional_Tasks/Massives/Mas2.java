package Additional_Tasks.Massives;

import java.util.Random;


//2. Дан массив с целыми числами. Вывести в консоль сумму элементов с четными индексами
public class Mas2 {
    public static void main(String[] args) {
        Random random = new Random();
                      int chet = 0;

        int[] array = new int[10];
        for (int i = 0; i < 10; i++) {
            array[i] = random.nextInt(100);
            System.out.println(array[i]);
            if (i % 2 == 0) {
                chet = chet + array[i];
            }
        }

        System.out.println("Summa po chetnim indexam: " + chet);
    }
}