package zimowy_semestr.MAS.MP2_Socha_Maria_s19701.binary_association;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import javax.print.event.PrintJobListener;

public class Author {
    private int IdAuthor;
    private String name;

    private int[] bookIds;

    private static List<Author> extent= new ArrayList<>();

    public Author(int IdAuthor, String name, int[] bookIds){
        this.IdAuthor = IdAuthor;
        this.name = name;
        this.bookIds = bookIds;

        extent.add(this);
    }

    public int getIdAuthor() {
        return this.IdAuthor;
    }

    public void setIdAuthor(int IdAuthor) {
        this.IdAuthor = IdAuthor;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int[] getBookIds() {
        return this.bookIds;
    }

    public void setBookIds(int[] bookIds) {
        this.bookIds = bookIds;
    }


    public static Author findAuthor(int id) throws Exception{
        for(Author author : extent){
            if(author.IdAuthor == id){
                return author;
            }
        }
        throw new Exception("Autor not found");
    }
    public Book[] getBooks(){
        Book[] books = new Book[200];

        try{
            for(int id : bookIds){
                books[books.length] = Book.findBook(id);
            }
            return books;
        } catch(Exception e){
            return null;
        }
    }

    public String printAuthorsBooks(){
        Book[] books = getBooks();
        String booksString = "";

        for(Book book : books){
            booksString += "/n" +book.getTitle();
        }
        return booksString;
    }


    @Override
    public String toString(){
        return name + printAuthorsBooks();
    }
}
