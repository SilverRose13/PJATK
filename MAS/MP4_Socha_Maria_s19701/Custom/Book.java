package MAS.MP4_Socha_Maria_s19701.Custom;

import java.time.LocalDate;

public class Book{
    private String title; //the title field attribute cannot be empty
    private String author;


    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) throws Exception{

        if(title.length() < 1){
            //since we have a set length that the title has to be, this is a static constraint
            //if the proposed title is empty then it cannot be set
            throw new Exception(String.format("The title cannot be blank"));
        } else {
            this.title = title;

        }

    }

    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    
}