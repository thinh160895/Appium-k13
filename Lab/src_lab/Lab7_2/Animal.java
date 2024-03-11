/*
* Create an Animal class with a method speed() which return a random speeds
* Create 3 objects for those 3 animal type
* Run and see which animal is winner for racing
*/

package Lab7_2;

import java.security.SecureRandom;

public class Animal {
    protected int speed;

    public Animal() {
        this.speed = generateRandomSpeed();
    }

    public int getSpeed() {
        return speed;
    }

    private int generateRandomSpeed() {
        SecureRandom random = new SecureRandom();
        return random.nextInt(getMaxSpeed() + 1);
    }

    protected int getMaxSpeed() {
        return 0; // This method will be overridden by subclasses
    }
}
