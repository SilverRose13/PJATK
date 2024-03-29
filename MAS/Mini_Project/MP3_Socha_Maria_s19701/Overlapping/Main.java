package MAS.MP3_Socha_Maria_s19701.Overlapping;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        //these reference type Pet and give the type of pet through an enumerator
        Pet_Overlapping Anu = new Pet_Overlapping("Anubis", PetType.DOG);
        Pet_Overlapping Mysia = new Pet_Overlapping("Mysia", PetType.CAT);

        Anu.setBirthdate(LocalDate.of(2021, 6, 8));
        Mysia.setBirthdate(LocalDate.of(2005, 12, 6));

        System.out.println(Anu.getName() + " " + Anu.getBirthdate() + " " + Anu.isYoung());
        System.out.println(Mysia.getName() + " " + Mysia.getBirthdate() + " " + Mysia.isYoung());
    }
}
