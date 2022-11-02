package Additional_Tasks.Conditions;

import java.util.Scanner;

// 3. Пользователь вводит в консоли длины сторон треугольника (три числа), выводим
//        сообщение, является ли треугольник равнобедренным, равносторонним или
//        разносторонним.
public class AT3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Vvedite storony treugolnika ");
        int one = sc.nextInt();
        int two = sc.nextInt();
        int three = sc.nextInt();
        if ((one + two) < three || (one + three) < two || (three + two) < one) {
            System.out.println("treugolnik ne sushestvuet!");
        } else if (one == two && two == three) {
            System.out.println("treugolnik ravnostoronniy");
        } else if (one == two || two == three || one == three) {
            System.out.println("Treugolnik ravnobedrenniy");
        }
        if (one != two && one != three && two != three) {
            System.out.println("Treugolnik raZnostoronniy");
        }
    }
}

