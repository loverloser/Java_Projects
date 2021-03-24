package Hw.t1;

public class Main {
    public static void main(String[] args) throws InterruptedException{
        ATM atm = new ATM(10_000);
        Thread t1 = new Thread(() -> atm.withdraw("Nick", 1000));
        Thread t2 = new Thread(() -> atm.withdraw("Mike", 5000));
        Thread t3 = new Thread(() -> atm.withdraw("Tim", 2000));
        Thread t4 = new Thread(() -> atm.withdraw("Tom", 7000));
        t1.start();
        t2.start();
        t3.start();
        t4.start();

        try {
            t1.join();
            t2.join();
            t3.join();
            t4.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Остатак в банкомате " +atm.getMoney());

    }
}
