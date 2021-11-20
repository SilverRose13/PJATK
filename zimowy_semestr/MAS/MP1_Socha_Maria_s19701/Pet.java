package MAS.MP1;

import java.time.LocalDate;
import java.util.ArrayList;

public class Pet {
    String name;
    LocalDate birthdate;
    ArrayList<Double> weight = new ArrayList<>();


    Pet(String name, LocalDate birthdate, double weight){
        this.name = name;
        this.birthdate = birthdate; //atrybut złozony
        this.weight.add(weight); //atrybut powtarzalny
    }

    public void show(){
        System.out.println(name + " average weight: " + avgWeight());
    }

    public double avgWeight(){ //atrybut pochodny
        double result = 0;
        if (weight.size() <= 6) {
            for(int i = weight.size()-1; i >= 0; i--){
                result += weight.get(i);
            }
            result /= weight.size();
        } else {
            for(int i = weight.size()-1, counter = 0; counter <= 7 ; i--, counter++){
                result += weight.get(i);
            }
            result /= 7;
        }

        return result;
    }
}
