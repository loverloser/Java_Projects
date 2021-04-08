package Hw.multithreaiding.t5;

import java.util.Map;
import java.util.Random;
import java.util.concurrent.*;

public class Main {
    private static final int ALL_CARS = 10;
    private static final Random random = new Random();
    private static final Semaphore tunnelSemaphore = new Semaphore(3);
    private static final CyclicBarrier cb = new CyclicBarrier(ALL_CARS);
    private static final CountDownLatch cd = new CountDownLatch(ALL_CARS);
    private static int winnerIndex = -1;
    private static final Object monitor = new Object();
    private static final Map<Integer, Long> scores = new ConcurrentHashMap<>();

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 0; i < ALL_CARS; i++) {
            final int q = i;
            executorService.execute(() -> {
                prepare(q);
                try {
                    cb.await();
                } catch (BrokenBarrierException | InterruptedException e) {
                    e.printStackTrace();
                }
                long start = System.currentTimeMillis();
                normalRoad1(q);
                tunnel(q);
                normalRoad2(q);

                synchronized (monitor) {
                    if (winnerIndex == -1) {
                        winnerIndex = q;
                    }
                }
                long end = System.currentTimeMillis();
                scores.put(q, end - start);
                cd.countDown();
            });
        }
        try {
            cd.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (Integer index : scores.keySet()) {
            System.out.println(index + " " + scores.get(index));
        }
        System.out.println("Winner is " + scores.get(winnerIndex));
        executorService.shutdown();
    }

    public static void sleepRandomTime() {
        long millis = random.nextInt(6000) + 1000;
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void prepare(int id) {
        System.out.println(id + " starts preparing");
        sleepRandomTime();
        System.out.println(id + " ends preparing");
    }

    public static void normalRoad1(int id) {
        System.out.println(id + " starts ride r1");
        sleepRandomTime();
        System.out.println(id + " ends ride r1");
    }

    public static void tunnel(int id) {
        try {
            tunnelSemaphore.acquire();
            System.out.println(id + " starts ride in the tunnel");
            sleepRandomTime();
            System.out.println(id + " ends ride in the tunnel");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            tunnelSemaphore.release();
        }
    }

    public static void normalRoad2(int id) {
        System.out.println(id + " starts ride r2");
        sleepRandomTime();
        System.out.println(id + " ends ride r2");
    }
}
