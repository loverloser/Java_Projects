package Tasks.Skillbox.Company;

public class Main {
    public static void main(String[] args) {
        Company company = new Company();
        for (int i = 0; i < 180; i++) {
            Operator operator = new Operator();
            company.hire(operator);
        }

        for (int i = 0; i < 80; i++) {
            Manager manager = new Manager();
            company.hire(manager);
        }
        for (int i = 0; i < 10; i++) {
            company.hire(new TopManager(company));
        }
        System.out.println("Добавлено сотрудников: " + company.getCountEmployees());

        System.out.println(company.getTopSalaryStaff(10));
        System.out.println(company.getLowestSalaryStaff(10));
    }
}
