package MAS.MP4_Socha_Maria_s19701.Unique;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Book{
    private int IdBook; //unique attribute
    private String title; //the title field attribute cannot be empty
    private String author;

    //this map contains all instances of this class searchable by IdBook
    //this is what is used to check whether an IdBook already exists
    private static Map<Integer, Book> books = new HashMap<>();

    public Book(int IdBook, String title, String author) throws Exception{
        //we check if the book ID is available
        //if not, we throw an exception
        if(books.containsKey(IdBook)){
            throw new Exception(String.format("Incorrect key: Key already exists"));
        }

        this.title = title;
        this.author = author;
        this.IdBook = IdBook;

        //once the book is created we add it to the books HashMap
        books.put(IdBook, this);
    }


    public int getIdBook() {
        return this.IdBook;
    }

    public void setIdBook(int IdBook) throws Exception{
        //we check if the book ID is available
        //if not, we throw an exception
        if(books.containsKey(IdBook)){
            throw new Exception(String.format("Incorrect key: Key already exists"));
        }

        //before we get rid of the old value of IdBook we have to remove it from the HashMap
        books.remove(this.IdBook);
        this.IdBook = IdBook;
        //after we change the IdBook we change it in the HashMap
        books.put(this.IdBook, this);
    }

    public Map getBooks(){
        return books;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) throws Exception{

        if(title.length() < 1){
            //since we have a set length that the title has to be, this is a static constraint
            //if the proposed title is empty then it cannot be set
            throw new Exception(String.format("The title cannot be blank"));
        } else {
            this.title = title;

        }

    }

    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    
}