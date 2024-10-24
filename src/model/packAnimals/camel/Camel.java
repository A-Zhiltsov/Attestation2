package model.packAnimals.camel;

import model.packAnimals.PackAnimals;

import java.time.LocalDate;

public class Camel extends PackAnimals {
    public Camel(String animalName, LocalDate dateOfBirth, int portableWeight) {
        super("Camel", animalName, dateOfBirth, portableWeight);
    }
}
