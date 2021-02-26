package Tasks.Skillbox.Company;

public class Main<TODO> {
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

//        fireHalfEmployees(company);



        System.out.println(company.getTopSalaryStaff(10));
        System.out.println(company.getLowestSalaryStaff(10));
    }

//    public static void fireE(Company company){
//        int countOfEmployees = company.getCountEmployees();
//        for (int i = 0; i < countOfEmployees / 2; i++) {
//            int index = (int) (Math.random() * company.getCountEmployees());
//            company.fire(company.getEmployees().get(index));
//        }
//    }

//    private static void fireHalfEmployees(Company company) {
//        int countEmployees = company.getCountEmployees();
//        for (int i = 0; i < countEmployees / 2; i++) {
//            int index = (int) (Math.random() * company.getCountEmployees());
//            Employee loser = company.getEmployees().get(index);
//            company.fire(loser);
//        }
//        System.out.println("Уволено " + countEmployees / 2 + " сотрудников");
//    }
}


