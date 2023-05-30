package MAS.MP3_Socha_Maria_s19701.Multi_aspect_inheritance;

public class FemaleDog extends MultiDog implements Female{
    //these attributes need to be added manually
    private boolean isSpayed;
    private boolean isPregnant;
    private int numberOfOffspring;

    public FemaleDog(String name, boolean isSpayed, boolean isPregnant, int numberOfOffspring) {
        super(name);

        this.isSpayed = isSpayed;
        this.isPregnant = isPregnant;
        this.numberOfOffspring = numberOfOffspring;
    }

    //the following are methods inherited from the Female interface
    public boolean isSpayed() {
        return isSpayed;
    }

    public boolean isPregnant() {
        return isPregnant;
    }


    public int numberOfOffspring() {
        return numberOfOffspring;
    }
    
    
}
