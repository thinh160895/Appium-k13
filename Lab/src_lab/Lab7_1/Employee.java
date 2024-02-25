/*
* Create a class Employee with a method salary to return employee’s salary
* There are 2 types of employee: Full time employee and contract employee
* Full time employee has salary is 50000 and contract employee has salary 40000
* Write a method to accept a list of Employee and calculate total salary
* For example, company has 3 FTE and 2 contractor
*/

package Lab7_1;

public abstract class Employee {
    protected double salary;
    public Employee(double salary) {
        this.salary = salary;
    }
    public abstract double salary();
}
