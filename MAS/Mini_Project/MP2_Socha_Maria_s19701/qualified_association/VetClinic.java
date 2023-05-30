package MAS.MP2_Socha_Maria_s19701.qualified_association;

import java.util.Dictionary;
import java.util.HashMap;
import java.util.Map;

public class VetClinic {
    //the vetClinic can find the description of dag by chcking its chip
    //the chip is used as a key for finding the dog description
    private Map<Chip, DogDescription> dogDescriptions;


    public VetClinic() {
        dogDescriptions = new HashMap<>();
    }


    public Map<Chip,DogDescription> getDogCatalogue() {
        return this.dogDescriptions;
    }

    public void addDog(Chip chip, DogDescription dogDescription){
        dogDescriptions.put(chip, dogDescription);
    }

    //class which finds the description of a given dog using it's chip
    public DogDescription getDogInfo(Chip chip){
        return dogDescriptions.get(chip);
    }




}
