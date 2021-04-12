package Tasks.Skillbox.bank;

public class Deposit extends BankAccount{
    private int number;

    public Deposit(int number) {
        this.number = number;
    }

    @Override
    public void withdrawMoney(int countOfMoney){
        //если дата за месяц до неё
        if(date.isBefore(date.plusMonths(1))){
            System.out.println("Вывод денег невозможен," +
                    " не прошло месяца с момента внесения");
        }else if(date.isBefore(date.plusMonths(1)) && countOfMoney < getTotalCash()) {
            this.minusMoney(countOfMoney);
        }
    }

}
