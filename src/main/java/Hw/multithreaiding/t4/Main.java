package Hw.multithreaiding.t4;

public class Main {
    public static void main(String[] args) {
        MFU mfu = new MFU();
        Thread t1 = new Thread(()->{
            mfu.print(10);
        });

        Thread t2 = new Thread(()->{
            mfu.scan(10);
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
