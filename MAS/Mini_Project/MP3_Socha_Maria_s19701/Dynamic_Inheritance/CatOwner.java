package MAS.MP3_Socha_Maria_s19701.Dynamic_Inheritance;

public class CatOwner extends PetOwner{
    private boolean hasLitterBox;

    //regular constructor for a CatOwner
    public CatOwner(String name, boolean hasLitterBox) {
        super(name);
        this.hasLitterBox = hasLitterBox;
    }

    //constructor for a DogOwner that is becoming a CatOwner
    public CatOwner(PetOwner prev, boolean hasLitterBox){
        super(prev.getName());
        this.hasLitterBox = hasLitterBox;
    }

    public boolean isHasLitterBox() {
        return this.hasLitterBox;
    }

    public boolean getHasLitterBox() {
        return this.hasLitterBox;
    }

    public void setHasLitterBox(boolean hasLitterBox) {
        this.hasLitterBox = hasLitterBox;
    }

}
