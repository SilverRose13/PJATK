package MAS.MP1_Socha_Maria_s19701;
import java.util.List;
import java.util.ArrayList;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.time.*;

class Dog extends Pet implements Serializable{
    static String species = "Dog";// atrybut klasowy
    String breed; //atrybut opcjonalny

    private static List<Dog> extent = new ArrayList<>(); //ekstensja klasy

    Dog(String name, LocalDate birthdate, String breed, double weight){
        super(name, birthdate, weight);

        this.breed = breed;
        addDog(this);
    }

    Dog(String name, LocalDate birthdate, double weight){ //przeciąenie
        super(name, birthdate, weight);

        addDog(this);
    }

    public void updateWeight(double newWeight){
        this.weight.add(newWeight);
    }

    public void show(){// metoda show() jest przesłonięta, dziękii temu pokazuje inne informacje dla klasy Pet i klasy Dog
        System.out.println(name + " breed: " + breed + " birthday: " + birthdate + " average weight: " + super.avgWeight());
    }

    @Override
    public String toString(){
        return name + " breed: " + breed + " birthday: " + birthdate + " average weight: " + super.avgWeight();
    }

    private static void addDog(Dog dog){ // dodawanine do ekstensji
        extent.add(dog);
    }

    private static void removeDog(Dog dog){ //usówanie z ekstensji 
        extent.remove(dog);
    }


    public static void showExtent(){ //wypisywanie ekstensji klasy
        System.out.println("Extent: " + Dog.class.getName());

        for (Dog dog :extent){
            System.out.println(dog);
        }
    }

    public static int dogCount(){ //metoda klasowa
        return extent.size();
    }

    //kolejne dwie metordy zapewniają trwałość ekstensji
    public static void writeExtent(ObjectOutputStream stream) throws IOException{ //zapisywanie ekstensji
        stream.writeObject(extent);
    }

    public static void readExtent(ObjectInputStream stream) throws IOException, ClassNotFoundException{//wczytywanie ekstensji
        extent = (ArrayList<Dog>) stream.readObject();
    }


}