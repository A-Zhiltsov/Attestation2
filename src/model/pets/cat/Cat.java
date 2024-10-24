package model.pets.cat;

import model.pets.Pets;

import java.time.LocalDate;

public class Cat extends Pets {
    public Cat(String animalName, LocalDate dateOfBirth, String ownerName) {
        super("Cat", animalName, dateOfBirth, ownerName);
    }
}
