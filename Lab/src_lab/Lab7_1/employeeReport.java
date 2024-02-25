package Lab7_1;

import java.util.ArrayList;
import java.util.List;

public class employeeReport {
    public static double totalSalary(List<Employee> employees) {
        double totalSalary = 0;
        for (Employee employee : employees) {
            totalSalary += employee.salary();
        }
        return totalSalary;
    }

    public static void main(String[] args) {
        // Create a list of employees
        List<Employee> employees = new ArrayList<>();

        // Add some full-time employees
        for (int i = 0; i < 3; i++) {
            employees.add(new fullTimeEmployee());
        }

        // Add some contract employees
        for (int i = 0; i < 2; i++) {
            employees.add(new constractEmployee());
        }

        // Calculate total salary
        double totalSalary = totalSalary(employees);
        System.out.println("Total salary: " + totalSalary);
    }
}
