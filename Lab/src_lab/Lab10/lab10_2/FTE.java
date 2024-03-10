package Lab10.lab10_2;

public class FTE extends Employee {
    public FTE() {
        this.salary = 50000;
    }

    @Override
    public double getSalary() {
        return salary;
    }
}
