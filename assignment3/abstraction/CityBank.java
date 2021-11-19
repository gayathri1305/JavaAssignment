package assignment3.abstraction;

public class CityBank extends Bank{
    String name;
    public  CityBank(){
        this.name="CITY";
    }
    public void countCurrency() {
        System.out.println("The following Denomination available in "+ this.name+
                " : "+"2000,500,200,100,20,10");

    }

    public static void main(String[] args) {
        CityBank c= new CityBank();
        c.countCurrency();
    }

    }

