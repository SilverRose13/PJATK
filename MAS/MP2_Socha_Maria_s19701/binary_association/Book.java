package MAS.MP2_Socha_Maria_s19701.binary_association;

import java.util.List;
import java.util.ArrayList;

public class Book {
    private int IdBook;
    private String title;

    //attribute containing the id of the author
    //it's an int instead of an array because the assumption is that each book only has one author
    private int authorId;

    private static List<Book> extent = new ArrayList<>();

    public Book(int IdBook, String title, int authorId){
        this.IdBook = IdBook;
        this.title = title;
        this.authorId = authorId;

        extent.add(this);
    }


    public int getIdBook() {
        return this.IdBook;
    }

    public void setIdBook(int IdBook) {
        this.IdBook = IdBook;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getAuthorId() {
        return this.authorId;
    }

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }


    public static Book findBook(int id) throws Exception{
        for(Book book : extent){
            if(book.IdBook == id){
                return book;
            }
        }
        throw new Exception("Book nort found");
    }

    //this method uses the atribut authorID to search through the extension of authors to find the author of the book
    public Author getAuthor(){
        try{
            return Author.findAuthor(authorId);
        }catch(Exception e){
            return null;
        }

    }

    @Override
    public String toString(){
        return title + " " + getAuthor().getName();
    }
    
}
