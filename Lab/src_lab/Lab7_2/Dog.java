package Lab7_2;

public class Dog extends Animal {

    private static final int MAX_SPEED = 60;

    @Override
    protected int getMaxSpeed() {
        return MAX_SPEED;
    }
}
