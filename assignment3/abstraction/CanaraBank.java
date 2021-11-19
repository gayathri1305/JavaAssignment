package assignment3.abstraction;

public class CanaraBank extends Bank{

    String name;
    public CanaraBank(){
        this.name="Canara";
    }
    public void countCurrency() {
        System.out.println("The following Denomination available in "+ this.name+
                " : "+"2000,500,200,100,50,20,10");

    }

    public static void main(String[] args) {
        CanaraBank canara= new CanaraBank();
        canara.countCurrency();
        canara.bond();
    }


}
