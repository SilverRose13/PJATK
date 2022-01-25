package MAS.MP3_Socha_Maria_s19701.Multi_Inheritance;

public class Pegasus extends Horse implements IBird {
    //a pegasus is part horse and part bird so it must inherit from both
    //since we can't extend both Horse and Bird, I have created the IBird interface instead

    //since I couldn't bring this attribute over via interface I'm adding it manually
    private boolean hasNest;

    public Pegasus(boolean saddleTrained, int numberOfOffspring, boolean hasNest) {
        //here it uses the Horse constructor
        super(saddleTrained, numberOfOffspring);

        this.hasNest = hasNest;
    }

    //I'm also bringing the getters and setters for hasNest over manually
     //since they refer to an attribute  not present in IBird
    public boolean isHasNest() {
        return this.hasNest;
    }

    public boolean getHasNest() {
        return this.hasNest;
    }

    public void setHasNest(boolean hasNest) {
        this.hasNest = hasNest;
    }
    
    //here I get a method from Bird via the IBird interface
    public boolean hasChicks() {
        return getNumberOfOffspring() > 0;
    }
    
}
