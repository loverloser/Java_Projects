package Tasks.Skillbox.Company;


public class Manager implements Employee {
    private int profit;
    private Company company;
    private final int FIX_SALARY = 50_000;
    private String post;

    public Manager() {
        this.profit = (int) (Math.random() * 140_000) + 115_000;
        this.post = "Manager";
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

    public int getFIX_SALARY() {
        return FIX_SALARY;
    }


    @Override
    public String toString() {
        return "Manager{" +
                "Salary=" + getMonthSalary() +
                ", post='" + post + '\'' +
                '}';
    }

    @Override
    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }
}
