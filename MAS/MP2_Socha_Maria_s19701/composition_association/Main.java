package MAS.MP2_Socha_Maria_s19701.composition_association;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        
        Book seasonsOfWar = new Book("Seasons of War", "Derek Landy", "Harper Collins");

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

        //this adds index 'entries' to a book
        //effectively it adds Pages to the Book, since they don't have much point in existing outside of a Book
        seasonsOfWar.addToIndex("she", she);
        seasonsOfWar.addToIndex("and", and);
        seasonsOfWar.addToIndex("into", into);

        System.out.println(seasonsOfWar.checkIndex("and"));
        System.out.println(seasonsOfWar.checkIndex("she"));
        System.out.println(seasonsOfWar.checkIndex("into"));
    }
    
}
