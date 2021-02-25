package Tasks.Skillbox.Company;


public class Manager implements Employee{
    private int salary;

    public Manager() {
        int profit = (int) (Math.random() * 140_000) + 115_000;
        this.salary = 50_000 + profit / 100 * 5 ;
    }

    @Override
    public int getMonthSalary() {
        return salary;
    }


}
