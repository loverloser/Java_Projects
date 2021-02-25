package Tasks.Skillbox.bank;

public class CreditCard extends BankAccount {
    private int cardNumber;

    public CreditCard(int cardNumber) {
        this.cardNumber = cardNumber;
    }


    @Override
    public void withdrawMoney(int countOfMoney) {
        if(countOfMoney > getTotalCash()){
            System.out.println("Недостаточно средств");
        } else this.minusMoney(countOfMoney + countOfMoney / 100);
    }
}
