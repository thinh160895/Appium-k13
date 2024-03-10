package Lab10.lab10_2;

import java.util.List;

public abstract class Employee {
    protected double salary;

    public abstract double getSalary();

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

