package model.packAnimals;

import model.Human_Friends;

import java.time.LocalDate;

public class PackAnimals extends Human_Friends {
    private int portableWeight;
    public PackAnimals(String animalKind, String animalName, LocalDate dateOfBirth, int portableWeight) {
        super(animalKind, animalName, dateOfBirth);
        this.portableWeight = portableWeight;
    }

    public int getPortableWeight() {
        return portableWeight;
    }

    public void setPortableWeight(int portableWeight) {
        this.portableWeight = portableWeight;
    }
}