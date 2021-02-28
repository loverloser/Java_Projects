package Tasks.Skillbox.Company;

public class Operator implements Employee{
    private final int FIX_SALARY = 40_000;
    private String post;
    private String name;

    public Operator(String name) {
        this.post = "operator";
        this.name = name;
    }

    @Override
    public int getMonthSalary() {
        return FIX_SALARY;
    }

    @Override
    public String toString() {
        return this.getMonthSalary() + " " + this.getName();
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
