package MAS.MP3_Socha_Maria_s19701.Overlapping;

import java.time.LocalDate;

enum PetType {DOG, CAT};

public class Pet {
    //I am using flattening to show and example of overlapping
    private String name;
    private LocalDate birthdate;
    private String history;

    //using petType and not a set of enums because
    //a pet can only be of one species
    private PetType petType;

    protected Pet(String name, PetType petType) {
        this.name = name;
        this.petType = petType;
    }


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthdate() {
        return this.birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    public String getHistory() {
        return this.history;
    }

    public void setHistory(String history) {
        this.history = history;
    }

    public int getAge(){
        return LocalDate.now().getYear() - getBirthdate().getYear();
    }

    public PetType getPetType(){
        return petType;
    }

    //sends to particular methods according to enum
    public boolean isYoung(){
        if(petType.equals(PetType.DOG)){
            return isPuppy();
        } else {
            if(petType.equals(PetType.CAT)){
                return isKitten();
            } else {
                if(getAge() < 2){
                    return true;
                } else {
                    return false;
                }
            }
        }
    }
    
    //brought to this class through flattening
    public boolean isPuppy(){
        if(getAge() < 1){
            return true;
        } else {
            return false;
        }
    }

    //brought to this class through flattening
    public boolean isKitten(){
        if(getAge() < 1){
            return true;
        } else {
            return false;
        }
    }
}
