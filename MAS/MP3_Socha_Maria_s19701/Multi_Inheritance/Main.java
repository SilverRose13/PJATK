package MAS.MP3_Socha_Maria_s19701.Multi_Inheritance;

public class Main {
    public static void main(String[] args) {
        //this example of multi-inheritance uses an interface for its implementation

        Pegasus peggy = new Pegasus(false, 2, true);

        //these are attributes inherited from Horse
        System.out.println("number of legs: " + peggy.getNumberOfLegs());
        System.out.println("face type: " + peggy.getFaceType());
        System.out.println("is saddle trained: " + peggy.getSaddleTrained());
        System.out.println("number of offspring: " + peggy.getNumberOfOffspring());
        System.out.println("has foals: " + peggy.hasFoal());

        //method inherited though IBird
        System.out.println("");
        System.out.println("has chicks: " + peggy.hasChicks());
    }
}
