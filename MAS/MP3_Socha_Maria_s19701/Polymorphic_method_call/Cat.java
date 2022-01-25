package MAS.MP3_Socha_Maria_s19701.Polymorphic_method_call;

public class Cat extends Pet {
    //child class
    //takes the constructor and all methods from parent class (Pet)

    public Cat(String name) {
        super(name);
    }

    public boolean isKitten(){
        if(getAge() < 1){
            return true;
        } else {
            return false;
        }
    }
    @Override
    public boolean isYoung(){
        return isKitten();
    }
    
}
