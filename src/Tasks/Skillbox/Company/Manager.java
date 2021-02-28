package Tasks.Skillbox.Company;


public class Manager implements Employee {
    private int profit;
    private Company company;
    private final int FIX_SALARY = 50_000;
    private String post;
    private String name;

    public Manager(String name) {
        this.profit = (int) (Math.random() * 140_000) + 115_000;
        this.post = "manager";
        this.name = name;
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

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    @Override
    public String toString() {
        return this.getMonthSalary() + "";
    }
}
