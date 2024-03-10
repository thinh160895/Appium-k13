package Lab10.lab10_2;

public class contractEmployee extends Employee {
    public contractEmployee() {
        this.salary = 40000;
    }

    @Override
    public double getSalary() {
        return salary;
    }
}
