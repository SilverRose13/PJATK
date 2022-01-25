package MAS.MP3_Socha_Maria_s19701.Multi_Inheritance;

enum FaceType {BEAK, SNOUT, MUZZLE};

public abstract class Animal {
    //parent class to Horse and Bird
    //Pegasus also inherits from this class
    private int numberOfLegs;
    private FaceType faceType;
    private int numberOfOffspring;


    public Animal(int numberOfLegs, FaceType faceType, int numberOfOffspring) {
        this.numberOfLegs = numberOfLegs;
        this.faceType = faceType;
        this.numberOfOffspring = numberOfOffspring;
    }


    public int getNumberOfLegs() {
        return this.numberOfLegs;
    }

    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    public FaceType getFaceType() {
        return this.faceType;
    }

    public void setFaceType(FaceType faceType) {
        this.faceType = faceType;
    }

    public int getNumberOfOffspring() {
        return this.numberOfOffspring;
    }

    public void setNumberOfOffspring(int numberOfOffspring) {
        this.numberOfOffspring = numberOfOffspring;
    }

    public void born(int newYoung){
        numberOfOffspring += newYoung;
    }

    public boolean hasOffspring(){
        return numberOfOffspring > 0;
    }
}
