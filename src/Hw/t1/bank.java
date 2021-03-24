package Hw.t1;

public class bank {
    private int money;

    public bank(int money) {
        this.money = money;
    }

    private void withdraw(String name, int moneyForWithdraw){
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    System.out.println(name + " подошёл к банкомату");
                    Thread.sleep(2000);
                    if (money >= moneyForWithdraw){
                        System.out.println(name + " вывел" + moneyForWithdraw
                                + " рублей " + "банкмате осталось " + money + " рублей");
                        money -= moneyForWithdraw;
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();

    }
}
