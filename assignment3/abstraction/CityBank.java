package assignment3.abstraction;

public class CityBank extends Bank{
   int money =67800;
    public void countCurrency() {
        if(money>2000){
            System.out.println("Money count:");
            System.out.println("2000 * " + (money/2000));
            System.out.println("500 * "+ (money%2000)/500);
        }

    }

    public static void main(String[] args) {
        CityBank c= new CityBank();
        c.countCurrency();
    }

    }
