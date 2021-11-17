package assignment3.abstraction;

public class HDFC extends Bank{
    int money=67800;

    public void countCurrency() {
        if(money>2000){
            System.out.println("Money count:");
            System.out.println("2000 * " + (money/2000));
        }

    }

    public static void main(String[] args) {
        HDFC h= new HDFC();
        h.countCurrency();
    }
}
