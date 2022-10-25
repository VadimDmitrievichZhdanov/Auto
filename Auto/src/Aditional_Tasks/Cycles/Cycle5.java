package Aditional_Tasks.Cycles;

import java.util.Scanner;
import java.util.Arrays;
//        5. Пользователь вводит строку. Выводим в консоль эту строку посимвольно (одна строка –
//        один символ)
public class Cycle5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Afftor, pishi esho!");
        String st = sc.nextLine();
        for (int i = 0; i < st.length(); i++) {
            System.out.println(st.charAt(i));
        }
    }
}