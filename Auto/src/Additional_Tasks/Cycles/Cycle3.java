package Additional_Tasks.Cycles;

import java.util.Arrays;
import java.util.Scanner;

//3. Пользователь вводит число - х. Выдаем число из последовательности фибоначчи с
//        индексом х
public class Cycle3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 0;
        int[] fibbMassiv = new int[45];
        fibbMassiv[0] = 1;
        fibbMassiv[1] = 1;
        fibbMassiv[2] = 2;
        for (int i = 1; i < 44; i++) {
            fibbMassiv[i+1] = (fibbMassiv[i] + fibbMassiv[i - 1]);

        }
        System.out.println(Arrays.toString(fibbMassiv));
        System.out.println("Kakoe po schetu chislo iz posledovatelnosty Fibonachchi vi hotite uznat?");
        System.out.println(fibbMassiv[sc.nextInt()-1]);
    }
}
