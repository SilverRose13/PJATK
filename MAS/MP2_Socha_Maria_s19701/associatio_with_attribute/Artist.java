package MAS.MP2_Socha_Maria_s19701.associatio_with_attribute;

import java.util.ArrayList;

public class Artist {
    private String name;

    //atribute containing the paintings created by the artist
    private ArrayList<Painting> paintings;


    public Artist(String name) {
        this.name = name;
        this.paintings = new ArrayList<>();
    }


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Painting> getPaintings() {
        return this.paintings;
    }

    public void setPaintings(ArrayList<Painting> paintings) {
        this.paintings = paintings;
    }

    //method creating a new paintingthrough the artist
    public void paint(Painting painting) {
        paintings.add(painting);
    }

    @Override
    public String toString(){
        String result = "";
        for(Painting painting : paintings){
            result += "\n   " + painting.getTitle();
        }

        return name + result;
    }



}
