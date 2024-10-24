package model.packAnimals.donkey;

import model.packAnimals.PackAnimals;

import java.time.LocalDate;

public class Donkey extends PackAnimals {
    public Donkey(String animalName, LocalDate dateOfBirth, int portableWeight) {
        super("Donkey", animalName, dateOfBirth, portableWeight);
    }
}
