package Hw.t4;

public class MFU {
    private static final Object LOCK1 = new Object();
    private static final Object LOCK2 = new Object();
    public void print(int pagesCount){
        synchronized (LOCK1){
            try {
                for (int i = 0; i < pagesCount; i++) {
                    Thread.sleep(100);
                    System.out.println("Отпечатано " + i + " страниц");

                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public void scan(int pagesCount){
        synchronized (LOCK2){
            try {
                for (int i = 0; i < pagesCount; i++) {
                    Thread.sleep(100);
                    System.out.println("Отсканированно " + i + " страниц");

                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
