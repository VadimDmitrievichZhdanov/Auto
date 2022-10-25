package Aditional_Tasks.Massives;

import java.util.Random;

//4. Дан массив с целыми числами. Вывести в консоль наибольшее из них
public class Mas4 {
    public static void main(String[] args) {
              Random random = new Random();
            int chet = -2147483648;

            int[] array = new int[10];
            for (int i = 0; i < 10; i++) {
                array[i] = random.nextInt();
                System.out.println(array[i]);
                if (array[i] > chet) {
                    chet = array[i];
                }
            }

            System.out.println("Samoe bolshoe chislo v massive: " + chet);
        }
    }

