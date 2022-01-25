package MAS.MP3_Socha_Maria_s19701.Disjoint_Inheritance;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Dog Anu = new Dog("Anubis");
        Cat Mysia = new Cat("Mysia");

        //the following methods are inherited from the Pet class but used in the Dog class
        Anu.setBirthdate(LocalDate.of(2021, 6, 8));
        Anu.setHistory("Bought from a breeder at 8 weeksa old.");

        //the following methods are inherited from the Pet class but used in the Cat class
        Mysia.setBirthdate(LocalDate.of(2005, 12, 6));
        Mysia.setHistory("Found at a building supplies company on New Years Eve.");

        System.out.println(Anu.getName() + " " + Anu.getBirthdate() + " " + Anu.getHistory());
        System.out.println(Mysia.getName() + " " + Mysia.getBirthdate() + " " + Mysia.getHistory());
    }
}
