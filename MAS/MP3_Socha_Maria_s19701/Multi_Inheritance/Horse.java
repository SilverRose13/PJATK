package MAS.MP3_Socha_Maria_s19701.Multi_Inheritance;

public class Horse extends Animal{
    //this is a child class of Animal and parent class of Pegasus
    //since Pegasus extends this class, there are no particular changes 
     //that need to be made to this class
    private static FaceType faceType = FaceType.MUZZLE;
    private static int numberOfLegs = 4;
    private boolean saddleTrained;


    public Horse(boolean saddleTrained, int numberOfOffspring) {
        super(numberOfLegs, faceType, numberOfOffspring);

        this.saddleTrained = saddleTrained;
    }

    public boolean isSaddleTrained() {
        return this.saddleTrained;
    }

    public boolean getSaddleTrained() {
        return this.saddleTrained;
    }

    public void setSaddleTrained(boolean saddleTrained) {
        this.saddleTrained = saddleTrained;
    }

    @Override
    public boolean hasOffspring(){
        return hasFoal();
    }

    public boolean hasFoal(){
        return getNumberOfOffspring() > 0;
    }
    
}
