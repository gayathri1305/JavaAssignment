package assignment3.polymorphism;

public class Adder {


    public static void main(String[] args) {
        IntAdder add= new IntAdder();
        add.concat();

        StringAdder sadd= new StringAdder();
        sadd.concat();
    }
}


