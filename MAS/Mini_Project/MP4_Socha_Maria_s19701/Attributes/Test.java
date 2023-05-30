package MAS.MP4_Socha_Maria_s19701.Attributes;

public class Test {
    public static void main(String[] args) throws Exception {
        Book percy = new Book("Percy JAckson", "Rick Riordan");

        percy.setTitle("Percy Jackson");
        System.out.println(percy.getTitle());

        //testing to see if it's possible to change the title to empty
        percy.setTitle("");
    }
}
