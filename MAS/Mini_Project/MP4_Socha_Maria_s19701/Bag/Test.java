package MAS.MP4_Socha_Maria_s19701.Bag;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) throws Exception {
        BagBook percy = new BagBook("Percy Jackson and the Lightning Thief");
        BagBook jason = new BagBook();
        BagBook bones = new BagBook("City of Bones");
        BagBook ashes = new BagBook("City of Ashes");


        jason.setTitle("Heroes of Olympus: The Lost Hero");
        Author rick = new Author("Rick Riordan");
        Author cassie = new Author("Cassandra Claire");


        bones.addAuthor(cassie);
        bones.addAuthor(rick);

        rick.addBagBook(percy);
        rick.addBagBook(jason);




        //checking if I can get authors for books
        for(int i = 0; i < percy.getAuthor().size(); i++){
            System.out.println(percy.getAuthor().get(i).getName());
        }


        for(int i = 0; i < jason.getAuthor().size(); i++){
            System.out.println(jason.getAuthor().get(i).getName());
        }

        for(int i = 0; i < bones.getAuthor().size(); i++){
            System.out.println(bones.getAuthor().get(i).getName());
        }
/* 
        for(int i = 0; i < ashes.getAuthor().size(); i++){
            System.out.println(ashes.getAuthor().get(i).getName());
        } */

        System.out.println();


        //checking if I can get books written by an author
        for(int i = 0; i < rick.getBagBooks().size(); i++){
            System.out.println(rick.getBagBooks().get(i).getTitle());
        }
        System.out.println();

        for(int i = 0; i < cassie.getBagBooks().size(); i++){
            System.out.println(cassie.getBagBooks().get(i).getTitle());
        }

    }
}
