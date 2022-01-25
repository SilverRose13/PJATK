package MAS.MP2_Socha_Maria_s19701.associatio_with_attribute;

import java.util.AbstractSet;
import java.util.ArrayList;


public class Painting {
    private String title;

    //attribute containing the painting's style
    private Style style;

    //attribute containing the painting's author
    private Artist artist;


    public Painting(String title, Style style, Artist artist) {
        this.title = title;
        this.style = style;
        this.artist = artist;

        artist.paint(this);
        style.paint(this);
    }


    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Style getStyle() {
        return this.style;
    }

    public void setStyle(Style style) {
        this.style = style;
    }

    public Artist getArtist() {
        return this.artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    @Override
    public String toString(){
        return title + " by " + artist.getName() + " done in the style of " + style.getName(); 
    }
}
