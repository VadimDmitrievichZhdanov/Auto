package Aditional_Tasks.Massives;

import java.util.HashMap;
import java.util.Random;

//5. Дан массив с целыми числами. Вывести в консоль наиболее часто встречающееся. Если
//        таких несколько, то вывести наибольшее из них, если повторяющихся нет, вывести
//        соответствующее сообщение.
public class Mas5 {

    public static int mode(int[] array) {
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        int max = 1;
        int temp = 0;

        for (int i = 0; i < array.length; i++) {

            if (hm.get(array[i]) != null) {

                int count = hm.get(array[i]);
                count++;
                hm.put(array[i], count);

                if (count > max) {
                    max = count;
                    temp = array[i];
                }
            } else
                hm.put(array[i], 1);
        }
        return temp;

    }

    public static void main(String[] args) {
        Random random = new Random();


        int[] array = new int[10];
        for (int i = 0; i < 10; i++) {
            array[i] = random.nextInt(10);
            System.out.println(array[i]);
                   }

        System.out.println("Povtor: " + mode(array));
    }
}

//TODO: переписать через Assertequals, без хэшмапа