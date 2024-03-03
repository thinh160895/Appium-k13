package Lab7_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class employeeReport {
    public static void main(String[] args) {
        Employee fte = new FTE();
        Employee constractemployee = new constractEmployee();

        fte.setSalary(60000);
        double totalSalary = new employeeReport().getTotalSalary(Arrays.asList(fte, constractemployee));
        System.out.println(totalSalary);
        }
    public double getTotalSalary(List<Employee> employeeList){
        double totalSalary = 0;
        for (Employee employee : employeeList) {
            totalSalary += employee.getSalary();
        }
        return totalSalary;
    }
}
