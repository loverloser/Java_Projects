package Tasks.Skillbox.Company;


public class Manager implements Employee {
    private int profit;
    private Company company;
    private final int FIX_SALARY = 50_000;

    public Manager() {
        this.profit = (int) (Math.random() * 140_000) + 115_000;
    }

    @Override
    public int getMonthSalary() {
        return FIX_SALARY + (profit / 5) * 100;
    }


    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public int getProfit() {
        return profit;
    }

    public void setProfit(int profit) {
        this.profit = profit;
    }

    @Override
    public String toString() {
        return this.getMonthSalary() + "";
    }
}
