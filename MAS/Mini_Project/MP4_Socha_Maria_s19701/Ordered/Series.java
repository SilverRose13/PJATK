package MAS.MP4_Socha_Maria_s19701.Ordered;

import java.util.ArrayList;

public class Series {
    //an example of an ordeered constraint
    //books can be added to a series but the order they are added in matters
        //since the story has to be read in chronological order

    private String name;

    private ArrayList<Book> booksInSeries;


    public Series() {
    }

    public Series(String name, ArrayList<Book> booksInSeries) {
        this.name = name;
        this.booksInSeries = booksInSeries;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Book> getBooksInSeries() {
        return this.booksInSeries;
    }

    public void setBooksInSeries(ArrayList<Book> booksInSeries) {
        this.booksInSeries = booksInSeries;
    }

    public Series name(String name) {
        setName(name);
        return this;
    }

    public Series booksInSeries(ArrayList<Book> booksInSeries) {
        setBooksInSeries(booksInSeries);
        return this;
    }


    public void addBookToSeries(Book book){
        this.booksInSeries.add(book);
    }

    @Override
    public String toString() {
        return "{" +
            " name='" + getName() + "'" +
            ", booksInSeries='" + getBooksInSeries() + "'" +
            "}";
    }

}
