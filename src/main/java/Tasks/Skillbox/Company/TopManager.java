package Tasks.Skillbox.Company;

public class TopManager implements Employee {
    private Company company;
    private final int FIX_SALARY = 70_000;
    private String post;

    public TopManager(Company company) {
        this.company = company;
        this.post = "Top manager";
    }

    @Override
    public int getMonthSalary() {
        if (company.getIncome() > 10_000_000) {
            int result = (int) (FIX_SALARY * 1.5);
            return FIX_SALARY + result;
        }
        return FIX_SALARY;
    }

    @Override
    public String toString() {
        return "TopManager{" +
                "Salary=" + getMonthSalary() +
                ", name='" + post + '\'' +
                '}';
    }


    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public int getFIX_SALARY() {
        return FIX_SALARY;
    }

    @Override
    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }
}
