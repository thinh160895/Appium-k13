package Lab7_1;

public class fullTimeEmployee extends Employee{
    public fullTimeEmployee() {
        super(40000);
    }
    @Override
    public double salary() {
        return 50000;
    }
}
