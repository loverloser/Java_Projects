package Tasks.Skillbox.bank;

import java.time.LocalDate;

public class BankAccount {
    private int totalCash;
    protected LocalDate date;

    public int getTotalCash() {
        return totalCash;
    }

    public void setTotalCash(int totalCash) {
        this.totalCash = totalCash;
    }

    public void withdrawMoney(int countOfMoney){
        if (countOfMoney < totalCash){
            totalCash -= countOfMoney;
        } else {
            System.out.println("Недостаточно средств");
        }
    }

    public void addMoney(int countOfMoney){
        totalCash += countOfMoney;
        date = LocalDate.now();
    }

    public boolean send(BankAccount receiver, int amount){
        if(this.totalCash < amount){
            System.out.println("Недостаточно средств");
            return false;
        }else{
            receiver.totalCash += amount;
            this.totalCash -= amount;
        }
        return true;

    }

    public void minusMoney(int amount){
        totalCash -= amount;
    }

    public void plusMoney(int amount){
        totalCash -= amount;
    }
}