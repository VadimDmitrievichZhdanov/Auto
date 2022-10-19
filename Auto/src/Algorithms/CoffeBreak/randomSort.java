package Algorithms.CoffeBreak;

import java.util.Random;

public class randomSort {
    static Random random = new Random();

    public static String getSort() {
        int randomSort = random.nextInt(4);
        String Sort = null;
        switch (randomSort) {
            case 0:
                Sort = "Arabika";
                break;
            case 1:
                Sort = "Robusta";
                break;
            case 2:
                Sort = "Liberica";
                break;
            case 3:
                Sort = "Excelsa";
                break;
//            case 0:
//                Sort = "Uncertain";
        }
        return Sort;
    }
}








