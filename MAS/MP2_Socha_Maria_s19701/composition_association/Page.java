package MAS.MP2_Socha_Maria_s19701.composition_association;

public class Page {
    //Pages only appear in Books
    private int number;
    private String text;


    public Page(int number, String text) {
        this.number = number;
        this.text = text;
    }


    public int getNumber() {
        return this.number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getText() {
        return this.text;
    }

    public void setText(String text) {
        this.text = text;
    }


    @Override
    public String toString() {
        return "{" +
            " number='" + getNumber() + "'" +
            ", text='" + getText() + "'" +
            "}";
    }

    
}
