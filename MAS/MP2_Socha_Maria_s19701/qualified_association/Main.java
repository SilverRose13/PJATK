package MAS.MP2_Socha_Maria_s19701.qualified_association;

public class Main {
    public static void main(String[] args) {
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
