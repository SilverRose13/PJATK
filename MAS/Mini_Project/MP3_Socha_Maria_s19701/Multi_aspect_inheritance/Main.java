package MAS.MP3_Socha_Maria_s19701.Multi_aspect_inheritance;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        FemaleDog anu = new FemaleDog("anubis", false, false, 0);
        MaleCat mysiek  = new MaleCat("mysiek", true);

        //the following methods are inherited from the Pet class but used in the Dog class
        anu.setBirthdate(LocalDate.of(2021, 6, 8));
        anu.setHistory("Bought from a breeder at 8 weeksa old.");

        //the following methods are inherited from the Pet class but used in the Cat class
        mysiek.setBirthdate(LocalDate.of(2005, 12, 6));
        mysiek.setHistory("Found at a building supplies company on New Years Eve.");

        //prints information inherited from Pet
        System.out.println(anu.getName() + " " + anu.getBirthdate() + " " + anu.getHistory());
        System.out.println(mysiek.getName() + " " + mysiek.getBirthdate() + " " + mysiek.getHistory());

        //prints information inherited from interface Female
        System.out.println(anu.getName() + " is pregnant: " + anu.isPregnant());
        System.out.println(anu.getName() + " is spayed: " + anu.isSpayed());
        System.out.println(anu.getName() + " number of puppies:" + anu.numberOfOffspring());

        //prints information inherited from interface Male
        System.out.println(mysiek.getName() + " is neutered: " + mysiek.isNeutered());

    }
}
