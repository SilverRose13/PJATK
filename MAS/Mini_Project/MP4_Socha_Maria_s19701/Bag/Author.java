package MAS.MP4_Socha_Maria_s19701.Bag;

import java.util.ArrayList;
import java.util.Objects;

public class Author {

    private String name;

    private ArrayList<BagBookAuthor> bagBookAuthor = new ArrayList<BagBookAuthor>();


    public Author() {
    }

    public Author(String name){
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<BagBookAuthor> getBagBookAuthor() {
        return this.bagBookAuthor;
    }

    public void setBagBookAuthor(ArrayList<BagBookAuthor> bagBookAuthor) {
        this.bagBookAuthor = bagBookAuthor;
    }


    public Author name(String name) {
        setName(name);
        return this;
    }

    public Author bagBookAuthor(ArrayList<BagBookAuthor> bagBookAuthor) {
        setBagBookAuthor(bagBookAuthor);
        return this;
    }

    public void addBagBookAuthor(BagBookAuthor bagBookAuthor) {
        this.bagBookAuthor.add(bagBookAuthor);
    }

    public ArrayList<BagBook> getBagBooks(){
        ArrayList bagBooks = new ArrayList<BagBook>();

        for(int i = 0; i < this.bagBookAuthor.size(); i++){
            bagBooks.add(this.bagBookAuthor.get(i).getBagBook());
        }
        return bagBooks;

    }


    public void addBagBook(BagBook bagBook){
        int exists = 0;
        for(int i = 0; i < bagBookAuthor.size(); i++){
            if(bagBookAuthor.get(i).getBagBook().equals(bagBook)){
                exists++;
            }
        }
        this.bagBookAuthor.add(new BagBookAuthor(bagBook, this));
        if(exists == 0) bagBook.addAuthor(this);
    }


    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Author)) {
            return false;
        }
        Author author = (Author) o;
        return Objects.equals(name, author.name) && Objects.equals(bagBookAuthor, author.bagBookAuthor);
    }



    @Override
    public String toString() {
        return "{" +
            " name='" + getName() + "'" +
            ", bagBookAuthor='" + getBagBookAuthor() + "'" +
            "}";
    }



    
}
