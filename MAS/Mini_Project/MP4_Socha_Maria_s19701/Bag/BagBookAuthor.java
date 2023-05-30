package MAS.MP4_Socha_Maria_s19701.Bag;

import java.util.Objects;

public class BagBookAuthor {
    //BagBookAuthor isn't really the right name for this class since
    //a BagBookAuthor can work with many authors and publish many books
    //might be a good idea to change it to the rather unoriginal BagBookAuthor
    //since the entire point of this class is to connect the two


    //private String name;
    private BagBook book;
    private Author author;

    public BagBookAuthor() {
    }

    public BagBookAuthor( BagBook book, Author author) {
        //this.name = name;
        this.book = book;
        this.author = author;
    }


    public BagBook getBagBook() {
        return this.book;
    }

    public void setBagBook(BagBook book) {
        this.book = book;
    }

    public Author getAuthor() {
        return this.author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
    

    public BagBookAuthor book(BagBook book) {
        setBagBook(book);
        return this;
    }

    public BagBookAuthor author(Author author) {
        setAuthor(author);
        return this;
    }


    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof BagBookAuthor)) {
            return false;
        }
        BagBookAuthor bagBookAuthor = (BagBookAuthor) o;
        return Objects.equals(book, bagBookAuthor.book) && Objects.equals(author, bagBookAuthor.author);
    }


    @Override
    public String toString() {
        return "{" +
            ", book='" + getBagBook() + "'" +
            ", author='" + getAuthor() + "'" +
            "}";
    }


}
