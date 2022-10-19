package Algorithms.CoffeBreak;

import java.util.Random;

public class randomSort {
    static Random random = new Random();
    public static String getSort() {
        int randomSort = random.nextInt(4);
        String Sort = null;
        switch (randomSort) {
            case 1:
                Sort = "Arabika";
                break;
            case 2:
                Sort = "Robusta";
                break;
            case 3:
                Sort = "Liberica";
                break;
            case 4:
                Sort = "Excelsa";
                break;
            default:
                break;
        }
              return Sort;
    }
}








