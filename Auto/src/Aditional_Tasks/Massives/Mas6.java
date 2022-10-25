package Aditional_Tasks.Massives;
//6. Дан двумерный массив 10х10 с целыми числами. Вывести в консоль все числа по
//        диагонали от [0][0] до [10][10]


public class Mas6 {
    public static void main(String[] args) {
        int[][] arr = new int[10][10];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = j + 1;
            }
        }
        for (int[] anArr : arr) {
            for (int anAnArr : anArr) {
                System.out.print(anAnArr + " ");
            }
            System.out.println();
        }
        for  (int x = 0; x < 10; x++){
            System.out.println(arr[x][x]);
        }
    }
}
