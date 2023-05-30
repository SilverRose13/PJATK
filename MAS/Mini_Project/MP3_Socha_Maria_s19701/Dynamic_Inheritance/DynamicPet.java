package MAS.MP3_Socha_Maria_s19701.Dynamic_Inheritance;

import java.time.LocalDate;

public class DynamicPet {
    //parent class
    
    String name;
    LocalDate birthdate;
    String history;


    public DynamicPet(String name) {
        this.name = name;
    }


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthdate() {
        return this.birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    public String getHistory() {
        return this.history;
    }

    public void setHistory(String history) {
        this.history = history;
    }
    
}
