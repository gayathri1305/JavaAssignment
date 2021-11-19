package assignment3.abstraction;

public class HDFC extends Bank{
    String name;
    public HDFC(){
        this.name="HDFC";

    }

    public void countCurrency() {
        System.out.println("The following Denomination available in "+ this.name+
                " : "+"2000,500,200,100,50,20");

    }

    public static void main(String[] args) {
        HDFC h= new HDFC();
        h.countCurrency();
        h.bond();
    }
}
