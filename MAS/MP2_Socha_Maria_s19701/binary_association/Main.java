package MAS.MP2_Socha_Maria_s19701.binary_association;

import java.util.List;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        //the assumption here is that:
        //every book has one author
        //but any author can have written multiple books

        Book CoG = new Book(1, "Chain of Gold", 1);
        Book CoB = new Book(2, "City of Bones", 1);
        Book  CA = new Book(3, "Clockwork Angel", 1);

        Book LSoDM = new Book(4, "Last Stand of Dead Men", 2);
        Book tDotL = new Book(5, "The Dying of the Light", 2);

        Book I = new Book(6, "Inkheart", 3);


        Author CC = new Author(1, "Cassandra Claire", new int[]{1, 2, 3});
        Author DL = new Author(2, "Derek Landy", new int[]{4,5});
        Author CF = new Author(3, "Conrelia Funke", new int[]{6}){};



        //when we print out an author we get their name and a list of books written by them
        System.out.println(CC);
        System.out.println(DL);
        System.out.println(CF);

        System.out.println("");

        //when we print out a book we also get it's author
        System.out.println(CoG);
        System.out.println(CoB);
        System.out.println(CA);

        System.out.println(LSoDM);
        System.out.println(tDotL);

        System.out.println(I);

    }
}
