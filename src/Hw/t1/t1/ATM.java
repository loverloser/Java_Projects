package Hw.t1.t1;

public class ATM {
    private int money;
    private final Object lock = new Object();

    public ATM(int money) {
        this.money = money;
    }

    public void withdraw(String name, int moneyForWithdraw){
        synchronized (lock) {
            System.out.println(name + " подошёл к банкомату");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (money >= moneyForWithdraw) {
                money -= moneyForWithdraw;
                System.out.println(name + " вывел " + moneyForWithdraw
                        + " рублей " + "банкмате осталось " + money + " рублей");

            } else {
                System.out.println("В банкомате недостаточно денег для " + name);
            }

        }
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
