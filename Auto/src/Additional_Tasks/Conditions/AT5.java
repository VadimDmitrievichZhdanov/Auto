package Additional_Tasks.Conditions;
//        5. Пользователь вводит в консоли три числа, выводим самое большое из них.
import java.util.Scanner;
public class AT5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int peremennaya = -2147483648;
        System.out.println("Vvedite 3 chisla");
        for (int i = 3; i > 0; i--) {
            int scan = sc.nextInt();
            if (scan > peremennaya) { peremennaya = scan;}
        }
        System.out.println("Samoe bolshoe chislo: " + peremennaya);
    }
}
