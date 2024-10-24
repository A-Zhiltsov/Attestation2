package model.pets.hamster;

import model.pets.Pets;

import java.time.LocalDate;

public class Hamster extends Pets {
    public Hamster(String animalName, LocalDate dateOfBirth, String ownerName) {
        super("Hamster", animalName, dateOfBirth, ownerName);
    }
}
