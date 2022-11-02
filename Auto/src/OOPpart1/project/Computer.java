package OOPpart1.project;

public class Computer {
    static String name = "Komp";
    //Переменные класса
//Свойства
//Конструкторы
//Методы
    static String processor = "Intel(R) Core(TM) i7-8700 CPU";
    static int OZU = 16;
    static byte SystemType = 64;
    static String videoCard = "Radeon RX Vega";
int sto;
    public Computer(String name, String processor, int OZU, String videoCard) {
        Computer.name = name;
        Computer.processor = processor;
        Computer.OZU = OZU;
        Computer.videoCard = videoCard;
    }
    int sum (int a, int b) {
        return a + b;
    }



    public static void main(String[] args) {

        System.out.println(Computer.name + "\n" + Computer.processor + "\n" + Computer.OZU + "Gb\n" + Computer.videoCard);

    }
}
