package Tasks.Skillbox.Company;

public class TopManager implements Employee{
    private Company company;
    private final int FIX_SALARY = 70_000;

    public TopManager(Company company) {
        this.company = company;
    }

    @Override
    public int getMonthSalary() {
        if(company.getIncome() > 10_000_000){
            int result = (int) (FIX_SALARY * 1.5);
            return FIX_SALARY + result;
        }
            return  FIX_SALARY;
    }

    @Override
    public String toString() {
        return this.getMonthSalary() + "";
    }
}
