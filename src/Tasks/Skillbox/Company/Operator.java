package Tasks.Skillbox.Company;

public class Operator implements Employee {
    private final int FIX_SALARY = 40_000;
    private String post;

    public Operator() {
        this.post = "Operator";
    }

    @Override
    public int getMonthSalary() {
        return FIX_SALARY;
    }

    @Override
    public String toString() {
        return "Operator{" +
                "salary= " + getMonthSalary() +
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
