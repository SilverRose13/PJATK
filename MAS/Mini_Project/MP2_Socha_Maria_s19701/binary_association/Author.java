package MAS.MP2_Socha_Maria_s19701.binary_association;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import javax.print.event.PrintJobListener;

public class Author {
    private int IdAuthor;
    private String name;

    //attribute containing ids of books written by the author
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

    //this method allows the class to find books written by the author
    public Book[] getBooks(){
        Book[] books = new Book[100];
        int counter = 0;


        try{
            for(int id : bookIds){
                books[counter] = Book.findBook(id);
                counter++;
                //System.out.println(books[counter-1]);
            }
            //System.out.println(counter);
            Book[] result = new Book[counter];
            //System.out.println(result[books.length-1]);

            for(int i = 0; i < counter; i++){
                result[i] = books[i];
            }

            //System.out.println(result);
            return result;
        } catch(Exception e){

            
            System.out.println("getBooks problem" + e.getClass());
            return null;
        }
    }

    //this class converts the array of books into an easier to print String
    public String AuthorsBooks(){
        Book[] books = this.getBooks();
        String booksString = "";

        if(books != null){
            for(Book book : books){
                booksString += "\n      " + book.getTitle();
            }
        }
        return booksString;
    }


    @Override
    public String toString(){
        return name + AuthorsBooks();
    }
}
