package MAS.MP3_Socha_Maria_s19701.Dynamic_Inheritance;

public class Main {
    public static void main(String[] args) {
        //I used copying to show the use of dynamin inheriatnace

        //creating our original PetOwners
        DogOwner rose = new DogOwner("Rose", true);
        CatOwner tina = new CatOwner("Martyna", true);

        //adding Pet values to show more of what is happeing in these objects
        rose.addPet(new Pet("Anubis"));
        tina.addPet(new Pet("Pusia"));

        //printing out our original pet owners
        System.out.println(rose.getName() + " " + rose.getPets().get(0).getName() + " " + rose.getLikesLongWalks());
        System.out.println(tina.getName() + " " + tina.getPets().get(0).getName()+ " " + tina.getHasLitterBox());

        //changing our CatOwner into a DogOwner
        DogOwner newTina = new DogOwner(tina, false);
        //changing out DogOwner into a CatOwner
        CatOwner newRose = new CatOwner(rose, false);

        //adding pets to our new pet owners
        newTina.addPet(new Pet("Pikus"));
        newRose.addPet(new Pet("Luna"));

        //printing out information stored wiht our new pet owners
        System.out.println(newRose.getName() + " " + newRose.getPets().get(0).getName() + " " + newRose.getHasLitterBox());
        System.out.println(newTina.getName() + " " + newTina.getPets().get(0).getName() + " " + newTina.getLikesLongWalks());
    }
}
