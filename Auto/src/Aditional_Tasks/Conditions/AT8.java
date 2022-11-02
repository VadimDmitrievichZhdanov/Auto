package Aditional_Tasks.Conditions;

import java.util.Random;
import java.util.Scanner;

//8. Программа “Магазин”, выводим меню из трех товаров с ценами. Пользователь выбирает
//        товар, вводит сумму денег. Если сумма меньше цены, выводим сообщение: “Денег не
//        хватает!”, если сумма равна цене – “Спасибо за покупку!”, если больше – “Ваша сдача:
//[сумма сдачи]”
public class AT8 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        int tovar1 = random.nextInt(100);
        int tovar2 = random.nextInt(100);
        int tovar3 = random.nextInt(100);
        System.out.println("For sell: ");
        System.out.println(" Verevka: " + tovar1 + " Russian rubles");
        System.out.println(" Milo: " + tovar2 + " Russian rubles");
        System.out.println(" Taburetka: " + tovar3 + " Russian rubles");
        System.out.println("vvedite nomer tovara k pokupke");
        int nomer = sc.nextInt();
        boolean x = false;
        while (!x) {
            if ((nomer > 3) | (nomer < 1)) {
                System.out.println("tut tri tovara vsego, ti chto, do treh schitat ne umeesh??? pishi cifru 1 ili 2, ili 3");
                nomer = sc.nextInt();
            } else {
                x = true;
            }
        }
        System.out.println("Plati denga");
        int denga = sc.nextInt();

        switch (nomer) {
            case (1):
                if (denga > tovar1) {
                    System.out.println("Sdacha: " + (denga - tovar1) + " Prodano!");
                } else if (denga < tovar1) {
                    System.out.println("Malo denyak! Nishebrod, Uhodi!");
                } else {
                    System.out.println("Spasibo chto bez sdachi. Prodano! ");
                }
                break;
            case (2):
                if (denga > tovar2) {
                    System.out.println("Sdacha: " + (denga - tovar2) + " Prodano!");
                } else if (denga < tovar2) {
                    System.out.println("Malo denyak! Nishebrod, Uhodi!");
                } else {
                    System.out.println("Spasibo chto bez sdachi. Prodano! ");
                }
                break;
            case (3):
                if (denga > tovar3) {
                    System.out.println("Sdacha: " + (denga - tovar3) + " Prodano!");
                } else if (denga < tovar3) {
                    System.out.println("Malo denyak! Nishebrod, Uhodi!");
                } else {
                    System.out.println("Spasibo chto bez sdachi. Prodano! ");
                }
                break;
            default:
                System.out.println("Net v prodaje");
                break;
        }

    }
}
