package MAS.MP2_Socha_Maria_s19701.qualified_association;

public class Chip {
    //this class is used as a key to find information (i.e. a description) of its dog
    private int ID;

    public Chip(int ID) {
        this.ID = ID;
    }

    public int getID() {
        return this.ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

}
