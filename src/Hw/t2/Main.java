package Hw.t2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        CountDownLatch countDownLatch = new CountDownLatch(3);
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        executorService.execute(() -> {
            long sum = 0;
            for (int i = 0; i < 1_000_000; i++) {
                if (i % 2 == 0) {
                    sum += i;
                }
            }
            System.out.println("Сумма чётных чисел равна " + sum);
            countDownLatch.countDown();
        });
        executorService.execute(() -> {
            long sum = 0;
            for (int i = 0; i < 1_000_000; i++) {
                if (i % 7 == 0) {
                    sum += i;
                }
            }
            System.out.println("Сумма чисел кратных 7 равна " + sum);
            countDownLatch.countDown();
        });
        executorService.execute(new Runnable() {
            List<Integer> list = new ArrayList<>();
            Random rand = new Random();
            long sum = 0;
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    list.add(rand.nextInt(1000));
                }
                for (int i = 0; i < list.size(); i++) {
                    if(list.get(i) % 2 == 0){
                        sum += list.get(i);
                    }
                }
                System.out.println("Сумма чётных чисел равна " + sum);
                countDownLatch.countDown();
            }
        });


        try {
            countDownLatch.await();
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
