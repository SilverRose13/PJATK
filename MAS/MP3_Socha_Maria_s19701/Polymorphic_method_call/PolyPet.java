package MAS.MP3_Socha_Maria_s19701.Polymorphic_method_call;

import java.time.LocalDate;

public abstract class PolyPet {
    //abstract class
    //parent class
    String name;
    LocalDate birthdate;
    String history;


    protected PolyPet(String name) {
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

    public int getAge(){
        return LocalDate.now().getYear() - getBirthdate().getYear();
    }

    public boolean isYoung(){
        if(getAge() < 2){
            return true;
        } else {
            return false;
        }
    }
    
}
