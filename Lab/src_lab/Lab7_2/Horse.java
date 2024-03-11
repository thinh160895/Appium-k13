package Lab7_2;

public class Horse extends Animal {

    private static final int MAX_SPEED = 75;

    @Override
    protected int getMaxSpeed() {
        return MAX_SPEED;
    }
}
