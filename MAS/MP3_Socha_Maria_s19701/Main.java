package MAS.MP3_Socha_Maria_s19701;

import java.time.LocalDate;

import MAS.MP3_Socha_Maria_s19701.Abstract_Inheritance.AbstractInheritanceCat;
import MAS.MP3_Socha_Maria_s19701.Abstract_Inheritance.AbstractInheritanceDog;
import MAS.MP3_Socha_Maria_s19701.Disjoint_Inheritance.DisjointCat;
import MAS.MP3_Socha_Maria_s19701.Disjoint_Inheritance.DisjointDog;
import MAS.MP3_Socha_Maria_s19701.Dynamic_Inheritance.CatOwner;
import MAS.MP3_Socha_Maria_s19701.Dynamic_Inheritance.DogOwner;
import MAS.MP3_Socha_Maria_s19701.Dynamic_Inheritance.DynamicPet;
import MAS.MP3_Socha_Maria_s19701.Multi_Inheritance.Pegasus;
import MAS.MP3_Socha_Maria_s19701.Multi_aspect_inheritance.FemaleDog;
import MAS.MP3_Socha_Maria_s19701.Multi_aspect_inheritance.MaleCat;
import MAS.MP3_Socha_Maria_s19701.Overlapping.Pet_Overlapping;
import MAS.MP3_Socha_Maria_s19701.Polymorphic_method_call.PolyCat;
import MAS.MP3_Socha_Maria_s19701.Polymorphic_method_call.PolyDog;
import MAS.MP3_Socha_Maria_s19701.Polymorphic_method_call.PolyPet;
import MAS.MP3_Socha_Maria_s19701.Overlapping.PetType;

public class Main{
    public static void main(String[] args) {
        //ABSTRACT INHERITANCE TESTING
        AbstractInheritanceDog Manu = new AbstractInheritanceDog("Manubis");
        AbstractInheritanceCat Nysia = new AbstractInheritanceCat("Nysia");

        //the following methods are inherited from the Pet class but used in the Dog class
        Manu.setBirthdate(LocalDate.of(2021, 6, 8));
        Manu.setHistory("Bought from a breeder at 8 weeksa old.");

        //the following methods are inherited from the Pet class but used in the Cat class
        Nysia.setBirthdate(LocalDate.of(2005, 12, 6));
        Nysia.setHistory("Found at a building supplies company on New Years Eve.");

        System.out.println(Manu.getName() + " " + Manu.getBirthdate() + " " + Manu.getHistory());
        System.out.println(Nysia.getName() + " " + Nysia.getBirthdate() + " " + Nysia.getHistory());

        //DISJOINT INHERITANCE TESTING
        DisjointDog Banu = new DisjointDog("Banubis");
        DisjointCat Mysia = new DisjointCat("Mysia");

        //the following methods are inherited from the Pet class but used in the Dog class
        Banu.setBirthdate(LocalDate.of(2021, 6, 8));
        Banu.setHistory("Bought from a breeder at 8 weeksa old.");

        //the following methods are inherited from the Pet class but used in the Cat class
        Mysia.setBirthdate(LocalDate.of(2005, 12, 6));
        Mysia.setHistory("Found at a building supplies company on New Years Eve.");

        System.out.println(Banu.getName() + " " + Banu.getBirthdate() + " " + Banu.getHistory());
        System.out.println(Mysia.getName() + " " + Mysia.getBirthdate() + " " + Mysia.getHistory());

        //DYNAMIC INHERITANCE TESTING
        //I used copying to show the use of dynamin inheriatnace

        //creating our original PetOwners
        DogOwner rose = new DogOwner("Rose", true);
        CatOwner tina = new CatOwner("Martyna", true);

        //adding Pet values to show more of what is happeing in these objects
        rose.addPet(new DynamicPet("Manubis"));
        tina.addPet(new DynamicPet("Pusia"));

        //printing out our original pet owners
        System.out.println(rose.getName() + " " + rose.getPets().get(0).getName() + " " + rose.getLikesLongWalks());
        System.out.println(tina.getName() + " " + tina.getPets().get(0).getName()+ " " + tina.getHasLitterBox());

        //changing our CatOwner into a DogOwner
        DogOwner newTina = new DogOwner(tina, false);
        //changing out DogOwner into a CatOwner
        CatOwner newRose = new CatOwner(rose, false);

        //adding pets to our new pet owners
        newTina.addPet(new DynamicPet("Pikus"));
        newRose.addPet(new DynamicPet("Luna"));

        //printing out information stored wiht our new pet owners
        System.out.println(newRose.getName() + " " + newRose.getPets().get(0).getName() + " " + newRose.getHasLitterBox());
        System.out.println(newTina.getName() + " " + newTina.getPets().get(0).getName() + " " + newTina.getLikesLongWalks());


        //MULTI-ASPECT INHERITANCE
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


        //MULTI INHERITANCE TESTING
        Pegasus peggy = new Pegasus(false, 2, true);

        //these are attributes inherited from Horse
        System.out.println("number of legs: " + peggy.getNumberOfLegs());
        System.out.println("face type: " + peggy.getFaceType());
        System.out.println("is saddle trained: " + peggy.getSaddleTrained());
        System.out.println("number of offspring: " + peggy.getNumberOfOffspring());
        System.out.println("has foals: " + peggy.hasFoal());

        //method inherited though IBird
        System.out.println("");
        System.out.println("has chicks: " + peggy.hasChicks());

        //OVERLAPPING INHERITANCE TESTING
        //these reference type Pet and give the type of pet through an enumerator
        Pet_Overlapping Nani = new Pet_Overlapping("Nanibis", PetType.DOG);
        Pet_Overlapping Myszka = new Pet_Overlapping("Myszka", PetType.CAT);

        Nani.setBirthdate(LocalDate.of(2021, 6, 8));
        Myszka.setBirthdate(LocalDate.of(2005, 12, 6));

        System.out.println(Nani.getName() + " " + Nani.getBirthdate() + " " + Nani.isYoung());
        System.out.println(Myszka.getName() + " " + Myszka.getBirthdate() + " " + Myszka.isYoung());

        //POLYMORPHIC METHOD CALL TESTING
        //these reference type Pet 
        PolyPet Mini = new PolyDog("Minibis");
        PolyPet Mnisia = new PolyCat("Mnisia");

        //the following methods are inherited from the Pet class but used in the Dog class
        Mini.setBirthdate(LocalDate.of(2021, 6, 8));
        //the following methods are inherited from the Pet class but used in the Cat class
        Mnisia.setBirthdate(LocalDate.of(2005, 12, 6));

        //.isYoung() is a pollymorphic call to the method 
        System.out.println(Mini.getName() + " " + Mini.getBirthdate() + " " + Mini.isYoung());
        System.out.println(Mnisia.getName() + " " + Mnisia.getBirthdate() + " " + Mnisia.isYoung());
    }
}

