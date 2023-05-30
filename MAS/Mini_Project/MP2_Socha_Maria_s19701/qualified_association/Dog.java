package MAS.MP2_Socha_Maria_s19701.qualified_association;

public class Dog {
    //the dog class represents the dogs that the vet clinic wants to find a description of
    //the the Chip attribute named id is used to find the description
    private Chip id;
    private String name;
    private String breed;


    public Dog(Chip id, String name, String breed) {
        this.id = id;
        this.name = name;
        this.breed = breed;
    }

    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    
    public static void born(Chip id, String name, String breed){
        new Dog(id, name, breed);
    }

    public Chip getId() {
        return this.id;
    }

    public void setId(Chip id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return this.breed;
    }
    
}
