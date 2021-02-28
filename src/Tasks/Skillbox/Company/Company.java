package Tasks.Skillbox.Company;

import java.util.*;

public class Company {
    private int income;
    private List<Employee> employees = new ArrayList<>();
    private int countEmployees;

    public Company() {
        this.income = (int) (Math.random() * 2_000_000) + 500_000;
    }

    public int getCountEmployees() {
        return countEmployees;
    }

    public void setCountEmployees(int countEmployees) {
        this.countEmployees = countEmployees;
    }

    public void hire(Employee employee) {
        employees.add(employee);
        countEmployees++;
    }

    public void hireAll(List<Employee> employees) {
        this.employees.addAll(employees);
    }

    public void fire(Employee employee) {
        employees.remove(employee);
        countEmployees--;
    }

    private List<Employee> getFilteredLimitedList(int count, Comparator<Employee> comparator) {
        List<Employee> copyList = new ArrayList<>(employees);
        copyList.sort(comparator);
        List<Employee> result = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            result.add(copyList.get(i));
        }
        return result;
    }

    public List<Employee> getTopSalaryStaff(int count) {
        return getFilteredLimitedList(count, (o1, o2) -> o2.getMonthSalary() - o1.getMonthSalary());
    }

    public List<Employee> getLowestSalaryStaff(int count) {
        return getFilteredLimitedList(count, Comparator.comparingInt(Employee::getMonthSalary));
    }

    public List<Employee> getTopSalaryAndPost(int count) {
        return getFilteredLimitedList(count, (o1, o2) -> {
            int flag = o2.getMonthSalary() - o1.getMonthSalary();
            if (flag == 0) {
                flag = o1.getPost().compareTo(o2.getPost());
            }
            return flag;
        });
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
