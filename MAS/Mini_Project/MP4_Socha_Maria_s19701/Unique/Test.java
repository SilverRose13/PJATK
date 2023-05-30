package MAS.MP4_Socha_Maria_s19701.Unique;

public class Test {
    public static void main(String[] args) throws Exception {
        Book percy = new Book(1, "Percy JAckson", "Rick Riordan");
        Book harry = new Book(2, "Harry Potter", "J. K. Rowling");
        //testing if creating a Book with a used id throws and exception
        Book val = new Book(2, "Skullduggery Pleasant", "Derek Landy");

        //testing if changin IdBook to an already existing one throws an exception
        harry.setIdBook(1);

        percy.setTitle("Percy Jackson");
        System.out.println(percy.getTitle());
        //testing if it's possible to change title to blank
        //percy.setTitle("");
    }
}
