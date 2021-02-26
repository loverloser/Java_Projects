package Tasks.Skillbox.Company;

public class TopManager implements Employee{
    private Company company;
    private final int FIX_SALARY = 70_000;

    public TopManager(Company company) {
        this.company = company;
    }

    @Override
    public int getMonthSalary() {
        return  FIX_SALARY + company.getIncome() > 10_000_000 ? (int) (FIX_SALARY * 1.5) : 0;
    }

    @Override
    public String toString() {
        return this.getMonthSalary() + "";
    }
}
