package model.pets;

import model.Human_Friends;

import java.time.LocalDate;

public class Pets extends Human_Friends {
    private String ownerName;
    public Pets(String animalKind, String animalName, LocalDate dateOfBirth, String ownerName) {
        super(animalKind, animalName, dateOfBirth);
        this.ownerName = ownerName;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }
}

