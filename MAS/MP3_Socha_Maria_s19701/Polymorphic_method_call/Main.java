package MAS.MP3_Socha_Maria_s19701.Polymorphic_method_call;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        //these reference type Pet 
        Pet Anu = new Dog("Anubis");
        Pet Mysia = new Cat("Mysia");

        //the following methods are inherited from the Pet class but used in the Dog class
        Anu.setBirthdate(LocalDate.of(2021, 6, 8));
        //the following methods are inherited from the Pet class but used in the Cat class
        Mysia.setBirthdate(LocalDate.of(2005, 12, 6));

        //.isYoung() is a pollymorphic call to the method 
        System.out.println(Anu.getName() + " " + Anu.getBirthdate() + " " + Anu.isYoung());
        System.out.println(Mysia.getName() + " " + Mysia.getBirthdate() + " " + Mysia.isYoung());
    }
}
