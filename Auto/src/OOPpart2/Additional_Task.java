package OOPpart2;

import java.util.Scanner;

//● С помощью оператора switch и циклов реализуйте программу, которая:
//выводит меню:
//○ 1. Ввести имя
//○ 2. Ввести фамилию
//○ 3. Ввести год рождения
//○ 4. Вывести информацию
//○ 0. Выход
//Пользователь вводит в консоли номер пункта меню.
//Первые три пункта принимают соответствующие значения в консоли. Вызов
//четвертого пункта выводит в консоль сводную информацию: “Имя: введенное
//имя, Фамилия: введенная фамилия, г.р.: введенный год”
//При вызове нулевого пункта программа заверщает работу
public class Additional_Task {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = "undefined";
        String surname = "undefined";
        int age = 0;
        int x = 0;
        int input;
        System.out.println(" 1. Ввести имя\n 2. Ввести фамилию\n 3. Ввести год рождения\n 4. Вывести информацию\n 0. Выход");

        while (x != 300) {

            input = Integer.parseInt(sc.next());

            switch (input) {
                case (1) -> name = sc.next();
                case (2) -> surname = sc.next();
                case (3) -> age = sc.nextInt();
                case (4) -> System.out.println(name + "\n" + surname + "\n" + age);
                case (0) -> x = 300;
                default -> System.out.println("wrong");
            }
        }
    }
}
