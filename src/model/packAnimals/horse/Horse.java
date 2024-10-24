package model.packAnimals.horse;

import model.packAnimals.PackAnimals;

import java.time.LocalDate;

public class Horse extends PackAnimals {
    public Horse(String animalName, LocalDate dateOfBirth, int portableWeight) {
        super("Horse", animalName, dateOfBirth, portableWeight);
    }
}
