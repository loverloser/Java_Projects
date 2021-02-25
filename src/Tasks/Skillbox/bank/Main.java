package Tasks.Skillbox.bank;

public class Main {

    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount();
        BankAccount bankAccount1 = new BankAccount();


        bankAccount.addMoney(123);
        bankAccount1.addMoney(321);
        bankAccount.send(bankAccount1, 123);
        System.out.println(bankAccount1.getTotalCash());
        System.out.println(bankAccount.getTotalCash());
        bankAccount1.send(bankAccount, 23);
        System.out.println(bankAccount.getTotalCash());
        System.out.println(bankAccount1.getTotalCash());

    }
}
