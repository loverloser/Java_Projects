package Hw.t1.t3;

import jdk.swing.interop.SwingInterOpUtils;

public class Main {
    private static final Object LOCK = new Object();
    private static final String A = "A";
    private static final String B = "B";
    private static final String C = "C";
    private static  String nextLetter = A;

    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (LOCK){
                    for (int i = 0; i < 5; i++){
                        try {
                            while (!nextLetter.equals(A)){
                                LOCK.wait();
                            }
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.print(A);
                        nextLetter = B;
                        LOCK.notifyAll();
                    }
                }
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (LOCK){
                    for (int i = 0; i < 5; i++){
                        try {
                            while (!nextLetter.equals(B)){
                                LOCK.wait();
                            }
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.print(B);
                        nextLetter = C;
                        LOCK.notifyAll();
                    }
                }
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (LOCK){
                    for (int i = 0; i < 5; i++){
                        try {
                            while (!nextLetter.equals(C)){
                                LOCK.wait();
                            }
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.print(C);
                        nextLetter = A;
                        LOCK.notifyAll();
                    }
                }
            }
        }).start();
    }
}
