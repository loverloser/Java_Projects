package Hw;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class Main {


    public static void main(String[] args) throws InterruptedException {
        ProducerConsumer pc = new ProducerConsumer();
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    pc.produce();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    pc.produce();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    pc.consume();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        thread1.start();
        thread2.start();
        thread3.start();

        thread1.join();
        thread2.join();
        thread3.join();
    }



}

class ProducerConsumer{
    private Random random = new Random();
    private Queue<Integer> storage = new LinkedList();
    private final int LIMIT = 10;
    private final Object lock = new Object();

    public void produce() throws InterruptedException{
        while (true) {
            synchronized (lock) {
                while (storage.size() == LIMIT){
                    lock.wait();
                }
                storage.add(random.nextInt(100));
                lock.notifyAll();
            }
        }
    }

    public void consume() throws InterruptedException{
        while(true){
            synchronized (lock){
                while(storage.size() == 0){
                    lock.wait();
                }
                System.out.println(storage.poll());
                System.out.println(storage.size());
                lock.notifyAll();
            }
            Thread.sleep(1000);
        }
    }

}

