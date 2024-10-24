package model.pets.dog;

import model.pets.Pets;

import java.time.LocalDate;

public class Dog extends Pets {
    public Dog(String animalName, LocalDate dateOfBirth, String ownerName) {
        super("Dog", animalName, dateOfBirth, ownerName);
    }
}
