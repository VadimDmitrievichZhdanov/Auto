package OOPpart2;

import java.util.Scanner;

//● Реализуйте пульт дистанционного управления: пользователь вводит номер
//канала, программа выводит название канала. Выход из программы по
//вводу “0”. Используйте массив.
public class RemoteControl {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int channel = -1;
        String[] Channels = new String[]{" ", "Первый канал", "Россия-1", "Матч ТВ", "НТВ", "Пятый канал",
                "Россия-Культура", "Россия-24", "Карусель", "Общественное телевидение России", "ТВ Центр",
                "РЕН ТВ", "Спас", "СТС", "Домашний", "ТВ-3", "Пятница!", "Звезда", "Мир", "ТНТ", "Муз-ТВ", "Че",
                "Евроновости", "ТНТ4", "СТС Love", "Суббота", "2x2", "Канал Disney", "Ю", "РБК"};
        while (channel != 0) {
            System.out.println("Enter the channel number");
            channel = sc.nextInt();
            if ((channel > 30) | (channel < 0)) {
                System.out.println("У нас всего 30 федеральных каналов");
                channel = sc.nextInt();
            }
            System.out.println(Channels[channel]);
        }
    }
}