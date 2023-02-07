package org.campus02.katja;

public class Animal {
    private String name;
    private String species;
    private String animalLoud;

    public Animal(String name) {
        this.name = name;
    }

    public Animal(String species, String animalLoud) {
        this.species = species;
        this.animalLoud = animalLoud;
    }

    public String getName() {
        return name;
    }

    public String getSpecies() {
        return species;
    }

    public String getAnimalLoud() {
        return animalLoud;
    }

    public void setSpecies(String species) {

        this.species = species;
    }

    public void setAnimalLoud(String animalLoud) {
        this.animalLoud = animalLoud;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String giveAnimalLoud(){
        return null;
    }
    public String getNameAndAge(){
        return null;
    }
    public String ageCategory(){
        return null;
    }
}
