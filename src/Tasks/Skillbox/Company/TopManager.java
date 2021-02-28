package Tasks.Skillbox.Company;

public class TopManager implements Employee{
    private Company company;
    private final int FIX_SALARY = 70_000;
    private String post;
    private String name;

    public TopManager(Company company, String name) {
        this.company = company;
        this.post = "topmanager";
        this.name = name;
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

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
