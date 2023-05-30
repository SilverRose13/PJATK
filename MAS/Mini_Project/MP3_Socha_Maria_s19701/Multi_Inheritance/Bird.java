package MAS.MP3_Socha_Maria_s19701.Multi_Inheritance;

public class Bird extends Animal implements IBird{
    //this is a child class of Animal
    //it also extends IBird
     //this assures us that when Pegasus implements IBird they will have the same methods
    private static FaceType faceType = FaceType.BEAK;
    private static int numberOfLegs = 2;
    private boolean hasNest;

    public Bird(boolean hasNest, int numberOfOffspring) {
        super(numberOfLegs, faceType, numberOfOffspring);

        this.hasNest = hasNest;
    }

    public boolean isHasNest() {
        return this.hasNest;
    }

    public boolean getHasNest() {
        return this.hasNest;
    }

    public void setHasNest(boolean hasNest) {
        this.hasNest = hasNest;
    }

    @Override
    public boolean hasOffspring(){
        return hasChicks();
    }

    public boolean hasChicks(){
        return getNumberOfOffspring() > 0;
    }
    
}
