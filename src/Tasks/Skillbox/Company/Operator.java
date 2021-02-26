package Tasks.Skillbox.Company;

public class Operator implements Employee{
    private final int FIX_SALARY = 40_000;


    @Override
    public int getMonthSalary() {
        return FIX_SALARY;
    }

    @Override
    public String toString() {
        return this.getMonthSalary() + "";
    }
}
