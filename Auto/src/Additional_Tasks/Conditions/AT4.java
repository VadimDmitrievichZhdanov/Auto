package Additional_Tasks.Conditions;
// 4. Пользователь вводит в консоли четыре числа. Рассчитываем и выводим в консоль
//        количество отрицательных и положительных чисел

import java.util.Scanner;

public class AT4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Vvedite chetire chisla");
        int schetchik = 0;
        int plus = 0;
        int minus = 0;
        int zero = 0;
        for (int i = 4; i > 0; i--) {
            schetchik++;
            System.out.println("chislo nomer " + schetchik);
            int scan = sc.nextInt();
            if (scan == 0) {
                zero++;
            } else if (scan > 0) {
                plus++;
            } else {
                minus++;
            }
        }
        System.out.println("Polojitelnih chisel vvedeno " + plus);
        System.out.println("Otricatelnih chisel vvedeno " + minus);
        System.out.println("Nuley vvedeno " + zero);
    }
}
