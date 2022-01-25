package MAS.MP4_Socha_Maria_s19701;

//I'm only importing Book from Unique and not from Attributes as well 
//as the Unique Book class is an expanded version of the Book class in Attributes
import MAS.MP4_Socha_Maria_s19701.Unique.Book;

public class Main {
    public static void main(String[] args) throws Exception {

        //for lines 11-22 the test tests are made so that they throw exceptions for wrong inputs
        //comment out former to test latter
        Book percy = new Book(1, "Percy JAckson", "Rick Riordan");
        Book harry = new Book(2, "Harry Potter", "J. K. Rowling");
        //testing if creating a Book with a used id throws and exception
        Book val = new Book(2, "Skullduggery Pleasant", "Derek Landy");

        //testing if changin IdBook to an already existing one throws an exception
        harry.setIdBook(1);

        percy.setTitle("Percy Jackson");
        System.out.println(percy.getTitle());
        //testing if it's possible to change title to blank
        percy.setTitle("");
    }
}
