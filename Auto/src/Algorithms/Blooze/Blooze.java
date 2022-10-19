package Algorithms.Blooze;

import java.util.concurrent.CountDownLatch;

public class Blooze {
    //Класс посвящённый процессу алкоголизма.
    public static void main(String[] args) {
        CountDownLatch countDownLatch = new CountDownLatch(5);
        Runnable task = () -> {
            try {
                countDownLatch.countDown();
                System.out.println("Прибухнуть " + countDownLatch.getCount() + " бутылку водки");
                countDownLatch.await();
                System.out.println("Закусить");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            finally {
                System.out.println("Уснуть");
            }
        };
        for (int i = 0; i < 5; i++) {
            new Thread(task).start();
        }
    }
}
