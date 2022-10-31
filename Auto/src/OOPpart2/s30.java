package OOPpart2;

import java.util.Scanner;

// ● Доработайте пример с циклом while (слайд 30) - преобразуйте его в
//бесконечный цикл с выходом, если введена строка “Exit”
//слайд 30:
//String str = new String();
//Scanner scanner = new Scanner(System.in);
//while (str.length() == 0) {
//System.out.print(“Please enter something”);
//str = scanner.nextLine();
//}
public class s30 {
    public static void main(String[] args) {


        String str = "";
        Scanner scanner = new Scanner(System.in);
        while (!str.equals("Exit")) {
            System.out.print("Please enter something(or type Exit to quit) ");
            str = scanner.nextLine();

        }
    }
}
