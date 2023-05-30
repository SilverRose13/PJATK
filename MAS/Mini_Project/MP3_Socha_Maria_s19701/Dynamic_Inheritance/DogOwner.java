package MAS.MP3_Socha_Maria_s19701.Dynamic_Inheritance;

public class DogOwner extends PetOwner{
    private boolean likesLongWalks;

    //regular constructor for a DogOwner
    public DogOwner(String name, boolean likesLongWalks) {
        super(name);

        this.likesLongWalks = likesLongWalks;
    }

    //constructor for a CatOwner that is becoming a DogOwner
    public DogOwner(PetOwner prev, boolean likesLongWalks){
        super(prev.getName());
        this.likesLongWalks = likesLongWalks;
    }
    

    public boolean isLikesLongWalks() {
        return this.likesLongWalks;
    }

    public boolean getLikesLongWalks() {
        return this.likesLongWalks;
    }

    public void setLikesLongWalks(boolean likesLongWalks) {
        this.likesLongWalks = likesLongWalks;
    }
    
}
