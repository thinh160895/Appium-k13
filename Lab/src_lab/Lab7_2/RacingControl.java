package Lab7_2;

public class RacingControl {
    public static void main(String[] args) {
        Animal Dog = new Dog();
        Animal Tiger = new Tiger();
        Animal Horse = new Horse();

        Animal winner = Dog;

        if (Tiger.getSpeed() > winner.getSpeed()) {
            winner = Tiger;
        }

        if (Horse.getSpeed() > winner.getSpeed()) {
            winner = Horse;
        }

        System.out.println("Winner is " + winner.getClass().getSimpleName() + ", with speed: " + winner.getSpeed() + " km/h");
    }
}
