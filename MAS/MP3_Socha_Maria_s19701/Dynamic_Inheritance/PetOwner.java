package MAS.MP3_Socha_Maria_s19701.Dynamic_Inheritance;

import java.util.ArrayList;

public class PetOwner {
    //parent class
    //not affected by the copying
    private String name;
    private ArrayList<Pet> pets;


    public PetOwner(String name) {
        this.name = name;
        this.pets = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Pet> getPets() {
        return this.pets;
    }

    public void setPets(ArrayList<Pet> pets) {
        this.pets = pets;
    }

    
    public void addPet(Pet pet){
        pets.add(pet);
    }

    public void removePet(Pet pet){
        pets.remove(pet);
    }

}
