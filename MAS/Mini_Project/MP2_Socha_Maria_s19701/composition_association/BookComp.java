package MAS.MP2_Socha_Maria_s19701.composition_association;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class BookComp {
    //a Pook contains Pages
    private String title;
    private String author;
    private String publisher;
    
    //we search to see what Pages a given word is on
    //like searching the books index
    private Map<String, ArrayList<Page>> index;


    public BookComp(String title, String author, String publisher) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;

        this.index = new HashMap<>();
    }


    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public String getPublisher() {
        return this.publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public Map<String, ArrayList<Page>> getIndex() {
        return this.index;
    }

    //this method adds 'entries' to the index
    public void addToIndex(String word, ArrayList<Page> arr){
        index.put(word, arr);
    }

    //this method winds the pages a given word appears on
    public ArrayList<Page> checkIndex(String word){
        return index.get(word);
    }

    @Override
    public String toString() {
        return "{" +
            " title='" + getTitle() + "'" +
            ", author='" + getAuthor() + "'" +
            ", publisher='" + getPublisher() + "'" +
            ", index='" + getIndex() + "'" +
            "}";
    }
 
}
