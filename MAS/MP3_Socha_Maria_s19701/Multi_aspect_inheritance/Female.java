package MAS.MP3_Socha_Maria_s19701.Multi_aspect_inheritance;

public interface Female {
    //these methods only apply to a female
    public boolean isSpayed();
    public boolean isPregnant();

    //this method can only return accurate results for a female
    public int numberOfOffspring();
}
