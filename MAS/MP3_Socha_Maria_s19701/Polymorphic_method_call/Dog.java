package MAS.MP3_Socha_Maria_s19701.Polymorphic_method_call;

public class Dog extends Pet{
    //child class
    //takes the constructor and all methods from parent class (Pet)

    public Dog(String name) {
        super(name);
    }    

    public boolean isPuppy(){
        if(getAge() < 1){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean isYoung(){
        return isPuppy();
    }
    
}
