package zimowy_semestr.MAS.MP2_Socha_Maria_s19701.binary_association;

import java.util.List;
import java.util.ArrayList;

public class Book {
    private int IdBook;
    private String title;

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
