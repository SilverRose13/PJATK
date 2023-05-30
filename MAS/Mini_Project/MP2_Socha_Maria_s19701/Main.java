package MAS.MP2_Socha_Maria_s19701;

import java.util.ArrayList;

import MAS.MP2_Socha_Maria_s19701.associatio_with_attribute.*;
import MAS.MP2_Socha_Maria_s19701.binary_association.*;
import MAS.MP2_Socha_Maria_s19701.composition_association.*;
import MAS.MP2_Socha_Maria_s19701.qualified_association.*;



public class Main {
    public static void main(String[] args) {
        //Associacion with attribute
        Artist picasso = new Artist("Pablo Picasso");

        Style cubism = new Style("Cubism");
        Style expressionism = new Style("Expressionism");

        //the painting class connects the artist and the style class
        //an artist can have paintings in multiple styles
        //and a style can be used by multiple artists
        Painting weapinWoman = new Painting("The Weaping Woman", cubism, picasso);
        Painting laReve = new Painting("La Rêve", cubism, picasso);
        Painting demoiselles = new Painting("Led Demoiselles d'Avignon", cubism, picasso);

        Painting theOldGuitarist = new Painting("The Old Guitarist", expressionism, picasso);

        //printing an artist gives us his name and all paintings created by him or hear
        System.out.println(picasso);

        //printing a style gives us its name and the the paintings created in it
        System.out.println(cubism);
        System.out.println(expressionism);

        //printing a painting gives us its title, author and style
        System.out.println(weapinWoman);
        System.out.println(laReve);
        System.out.println(demoiselles);
        System.out.println(theOldGuitarist);


        //Binary Association
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


        //Composition Association
        BookComp seasonsOfWar = new BookComp("Seasons of War", "Derek Landy", "Harper Collins");

        Page pg167 = new Page(167, "...I'll stay here, she said...");
        Page pg242 = new Page(242, "...Skulduggery murmured, reaching into his pocket...");
        Page pg375 = new Page(375, "...And then he walked out the front door...");
        Page pg447 = new Page(447, "...Valkyrie wriggled and squirmed as much as she could...");

        ArrayList she = new ArrayList<>();
        she.add(167);
        she.add(447);

        ArrayList and = new ArrayList<>();
        and.add(375);
        and.add(477);

        ArrayList into = new ArrayList<>();
        into.add(242);

        //this adds index 'entries' to a BookComp
        //effectively it adds Pages to the BookComp, since they don't have much point in existing outside of a BookComp
        seasonsOfWar.addToIndex("she", she);
        seasonsOfWar.addToIndex("and", and);
        seasonsOfWar.addToIndex("into", into);

        System.out.println(seasonsOfWar.checkIndex("and"));
        System.out.println(seasonsOfWar.checkIndex("she"));
        System.out.println(seasonsOfWar.checkIndex("into"));


        //Qualified Association
        Chip chip1 = new Chip(1);
        Chip chip2 = new Chip(2);
        Chip chip3 = new Chip(3);
        Chip chip4 = new Chip(4);

        Dog anu = new Dog(chip1, "Anubis", "Siberian Husky");
        Dog kreska = new Dog("Kreska", "Jack Russel Terrier");
        Dog leny = new Dog(chip2, "Leny", "Golden Retriever");
        Dog lotka = new Dog(chip3, "Lotka", "Golden Retriever");
        Dog perelka = new Dog(chip4, "Perelka", "Mixed Brred");

        DogDescription anuDD = new DogDescription("gastrointestinal isseues due to parasite");
        DogDescription lotkaDD = new DogDescription("newly taken from an animal shelter");
        DogDescription lenyDD = new DogDescription("elderly dog, in good health");
        DogDescription perelkaDD = new DogDescription("no health problems");

        VetClinic clinic = new VetClinic();

        clinic.addDog(chip1, anuDD);
        clinic.addDog(chip2, lenyDD);
        clinic.addDog(chip3, lotkaDD);
        clinic.addDog(chip4, perelkaDD);

        System.out.println(clinic.getDogInfo(anu.getId()));
        System.out.println(clinic.getDogInfo(leny.getId()));
        System.out.println(clinic.getDogInfo(lotka.getId()));
        System.out.println(clinic.getDogInfo(perelka.getId()));

    }
    
}
