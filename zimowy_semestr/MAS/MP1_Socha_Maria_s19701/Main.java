package MAS.MP1;
import java.util.ArrayList;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.*;


public class Main{
    public static void main(String[] args) {
    
        Dog anubis = new Dog("Anubis", LocalDate.of(2021, 6, 8), "Siberian Husky", 10); // data jest ztrybutem złozonym
        Dog kreska = new Dog("Kreska", LocalDate.of(2021, 4, 13), "Jack Russel Terrier", 5); 
        //Konstruktor jest przeciąony, dzięki czemu nie musimy określaś rasy ale mozemy
        Dog lotka = new Dog("Lotka", LocalDate.of(2020, 3, 20), 20); //rasa psa jest atrybutem opcjonalnym
        Dog aria = new Dog("Aria", LocalDate.of(2021, 5, 10), "Alaskan Malamute", 18);

        //waga jest atrybutem powtarzalnym
        //mozna aktualizować wage a potem otrzymać średnią wagę z poprzednich 7 dni
        anubis.updateWeight(11.2); 
        anubis.updateWeight(13);
        anubis.updateWeight(14);
        System.out.println("Dog count: " + Dog.dogCount());// przykład uycia metody klasoweej
        
        System.out.println("Dog species: " + Dog.species); //w klasie Dog, gatunek zawsze będzie "Dog" więc jest to atrybut klasowy

        System.out.println(anubis.avgWeight());//średnia wagi z ostatnich 7 wpisów jest atrybutem pochodnym
        kreska.show();// metoda show jest przesłoniona w klasie dog, przez co wypisuje inne dane niz dla obiektu klasy Pet
    
        //zapisywanie i wczytywanie ekstensji
        try{
            var out = new ObjectOutputStream(new FileOutputStream("ekstensja.txt"));
            Dog.writeExtent(out);
            out.close();

            var in = new ObjectInputStream(new FileInputStream("ekstensja.txt"));
            Dog.readExtent(in);
            in.close();
        } catch (IOException | ClassNotFoundException e){

        }

        Dog.showExtent();//wypisuje ekstensji do konsoli
    }
}


