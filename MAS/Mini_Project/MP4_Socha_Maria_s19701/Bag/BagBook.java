package MAS.MP4_Socha_Maria_s19701.Bag;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Objects;

public class BagBook{
    private String title; //the title field attribute cannot be empty
    private ArrayList<BagBookAuthor> bagBookAuthor = new ArrayList<BagBookAuthor>();


    public BagBook() {

    }

    public BagBook(String title){
        this.title = title;
        //this.BagBookAuthor = new ArrayList<BagBookAuthor>();
    }

    public BagBook(String title, ArrayList<BagBookAuthor> bagBookAuthor) {
        this.title = title;
        this.bagBookAuthor = bagBookAuthor;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ArrayList<BagBookAuthor> getBagBookAuthor() {
        return this.bagBookAuthor;
    }
    

    public void setBagBookAuthor(ArrayList<BagBookAuthor> bagBookAuthor) {
        this.bagBookAuthor = bagBookAuthor;
    }

    public void addBagBookAuthor(BagBookAuthor bagBookAuthor){
        this.bagBookAuthor.add(bagBookAuthor);
    }

    public BagBook title(String title) {
        setTitle(title);
        return this;
    }

    public BagBook BagBookAuthor(ArrayList<BagBookAuthor> bagBookAuthor) {
        setBagBookAuthor(bagBookAuthor);
        return this;
    }

    public ArrayList<Author> getAuthor() {
        ArrayList authors = new ArrayList<Author>();

        for(int i = 0; i < this.bagBookAuthor.size(); i++){
            authors.add(this.getBagBookAuthor().get(i).getAuthor());
        }
        return authors;
    }


    public void addAuthor(Author author){
        int exists = 0;
        for(int i = 0; i < bagBookAuthor.size(); i++){
            if(bagBookAuthor.get(i).getAuthor().equals(author)){
                exists++;
            }
        }
        this.bagBookAuthor.add(new BagBookAuthor(this, author));
        if(exists == 0) author.addBagBook(this);
    }





    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof BagBook)) {
            return false;
        }
        BagBook bagBook = (BagBook) o;
        return Objects.equals(title, bagBook.title) && Objects.equals(bagBookAuthor, bagBook.bagBookAuthor);
    }






    @Override
    public String toString() {
        return "{" +
            " title='" + getTitle() + "'" +
            ", BagBookAuthor='" + getBagBookAuthor() + "'" +
            "}";
    }



    
}