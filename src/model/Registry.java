package model;

import java.util.ArrayList;

public class Registry {
    private ArrayList<Human_Friends> animals;

    public Registry() {
        this.animals = new ArrayList<Human_Friends>();
    }

    public ArrayList<Human_Friends> getAnimals() {
        return animals;
    }

    public void addAnimal(Human_Friends animal) {
        this.animals.add(animal) ;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Human_Friends a : animals){
            sb.append(a);
        }
        return sb.toString();
    }
}
