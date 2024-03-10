package Lab7_2;

import java.security.SecureRandom;

public class Horse extends Animal {

    private static final int MAX_SPEED = 75;

    public Horse() {
        this.speed = new SecureRandom().nextInt(MAX_SPEED + 1);
    }
}
