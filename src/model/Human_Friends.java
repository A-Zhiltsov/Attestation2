package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Human_Friends {
    private String animalKind;
    private String animalName;
    private LocalDate dateOfBirth;
    private List<String> commands;

    public Human_Friends(String animalKind, String animalName, LocalDate dateOfBirth) {
        this.animalKind = animalKind;
        this.animalName = animalName;
        this.dateOfBirth = dateOfBirth;
        this.commands = new ArrayList<>();
    }

    public String getAnimalKind() {
        return animalKind;
    }

    public void setAnimalKind(String animalKind) {
        this.animalKind = animalKind;
    }

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public List<String> getCommands() {
        return commands;
    }

    public void addCommand(String command) {
        this.commands.add(command);
    }

    @Override
    public String toString() {
        return String.format("Animal type: %s\nName: %s\nBirthdate: %s\nCommands: %s",
                animalKind, animalName, dateOfBirth, commands );}
}

