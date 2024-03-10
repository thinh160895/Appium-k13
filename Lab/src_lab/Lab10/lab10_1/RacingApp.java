package Lab10.lab10_1;
import java.security.SecureRandom;
import java.util.Arrays;

import static Lab10.lab10_1.Animal.Builder;

public class RacingApp {
    public static void main(String[] args) {
        Animal horse = new Builder().setName("Horse").setSpeed(generateAnimalSpeed(75))
                .setFlyable(false).build();
        Animal tiger = new Builder().setName("Tiger").setSpeed(generateAnimalSpeed(100))
                .setFlyable(false).build();
        Animal dog = new Builder().setName("Dog").setSpeed(generateAnimalSpeed(120))
                .setFlyable(false).build();
        Animal eagle = new Builder().setName("Eagle").setSpeed(generateAnimalSpeed(60))
                .setFlyable(false).build();

        Animal winner = new RacingController().getWinner(Arrays.asList(horse, tiger, eagle, dog));
        System.out.println("Winner is " + winner.getName() + ", with speed: " + winner.getSpeed() + " km/h, and " + (winner.isFlyable() ? "can fly" : "cannot fly."));
    }

    private static int generateAnimalSpeed(int maxSpeed){
        return new SecureRandom().nextInt(maxSpeed) + 1;
    }

}
