package Lab10.lab10_2;

import java.util.Arrays;
import java.util.List;

public class employeeReport {
    public static void main(String[] args) {
        Employee fte = new FTE();
        Employee contractEmployee = new contractEmployee();

        fte.setSalary(60000);
        double totalSalary = getTotalSalary(Arrays.asList(fte, contractEmployee));
        System.out.println(totalSalary);
    }

    public static double getTotalSalary(List<Employee> employeeList) {
        double totalSalary = 0;
        for (Employee employee : employeeList) {
            totalSalary += employee.getSalary();
        }
        return totalSalary;
    }
}

