package Tasks.Skillbox.Company;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CompareBySalaryAndPost implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        int flag = o1.getMonthSalary() - o2.getMonthSalary();

        if(flag == 0){
            flag = o1.getPost().compareTo(o2.getPost());
        }
        return flag;
    }


}
