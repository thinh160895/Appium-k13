package Lab10.lab10_1;

import java.util.ArrayList;
import java.util.List;

public class RacingController {
    public Animal getWinner(List<Animal> animalList){

        // Note for future: animalList: null, empty
        Animal winner = null;
        List<Animal> eligibleAnimal = getEligibleRacingAnimals(animalList);

        // Note for future: animalList: null, empty
        for (Animal animal : eligibleAnimal){
            if (winner == null || animal.getSpeed() > winner.getSpeed()){
                winner = animal;
            }
        }
        return winner;
    }

    private List<Animal> getEligibleRacingAnimals(List<Animal> animalList) {
        List<Animal> eligibleAnimal = new ArrayList<>();
        for (Animal animal : animalList) {
            if (!animal.isFlyable()) {
                eligibleAnimal.add(animal);
            }
        }
        return eligibleAnimal;
    }
}
