package MAS.MP3_Socha_Maria_s19701.Multi_aspect_inheritance;

public class MaleCat extends MultiCat implements Male{
    //these attributes needed to be implemented manually
    private boolean isNeutered;

    public MaleCat(String name, boolean isNeutered) {
        super(name);

        this.isNeutered = isNeutered;
    }

    //this is a method inherited from the Male interface
    public boolean isNeutered() {
        return isNeutered;
    }
    
}
