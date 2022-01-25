package MAS.MP3_Socha_Maria_s19701.Dynamic_Inheritance;

import java.util.ArrayList;

public class PetOwner {
    //parent class
    //not affected by the copying
    private String name;
    private ArrayList<DynamicPet> pets;


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

    public ArrayList<DynamicPet> getPets() {
        return this.pets;
    }

    public void setPets(ArrayList<DynamicPet> pets) {
        this.pets = pets;
    }

    
    public void addPet(DynamicPet pet){
        pets.add(pet);
    }

    public void removePet(DynamicPet pet){
        pets.remove(pet);
    }

}
