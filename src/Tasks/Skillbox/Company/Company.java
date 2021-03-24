package Tasks.Skillbox.Company;

import java.util.ArrayList;
import java.util.List;

public class Company {
    private int income;
    private List<Employee> employees = new ArrayList<>();

    public void hire(Employee employee){
        this.employees.add(employee);
    }

    public void hireAll(List<Employee> employees){
        this.employees.addAll(employees);
    }

    public void fire(Employee employee){
        employees.remove(employee);
    }

    public int getIncome() {
        return income;
    }

    public void setIncome(int income) {
        this.income = income;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
}
