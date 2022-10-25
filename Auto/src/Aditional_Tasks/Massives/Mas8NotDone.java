package Aditional_Tasks.Massives;

import java.util.Random;

// 8. Дан двумерный массив 5х5 с целыми числами. Посчитать суммы чисел в каждом столбце и
//        вывести наибольшую из них
public class Mas8NotDone {
    public static void main(String[] args) {
        Random rand = new Random();
        int summ;
        int summ2;
        int summ3;
        int summ4;
        int summ5;

        int[][] arr = new int[5][5];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = rand.nextInt(10);
            }
        }
        for (int[] anArr : arr) {
            for (int anAnArr : anArr) {
                System.out.print(anAnArr + " ");
            }
            System.out.println();
        }
        summ = arr[0][0] + arr[1][0] + arr[2][0] + arr[3][0] + arr[4][0];
        summ2 = arr[0][1] + arr[1][1] + arr[2][1] + arr[3][1] + arr[4][1];
        summ3 = arr[0][2] + arr[1][2] + arr[2][2] + arr[3][2] + arr[4][2];
        summ4 = arr[0][3] + arr[1][3] + arr[2][3] + arr[3][3] + arr[4][3];
        summ5 = arr[0][4] + arr[1][4] + arr[2][4] + arr[3][4] + arr[4][4];
        System.out.println(summ + " " + summ2 + " " + summ3 + " " + summ4 + " " + summ5);


    }
}



