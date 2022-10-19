package Primitives;

public class AllPrimitives {
    public static void main(String[] args) {

       /*
        int a = 5;
        int b = 10;
        double c = a + b;
        Работает толþко от менее тоùного к более тоùному.
        Ответ - память    */
        final byte x = 2;
        byte y = x + 2;
        /* Ответ - память, порядок компиляции. не обязательно переводить в int,
         можно убедить джаву, что х далее не изменится */
        double a = 10.3;
        double b = 9.8;
        int c = (int)a + (int)b;
        int d = (int)(a + b);
        /* Ответ с = 20, d = 19;
        Потому что с = 10+9, а d = 20.1
         */
        System.out.println(d);
        System.out.println(c);
    }
}
