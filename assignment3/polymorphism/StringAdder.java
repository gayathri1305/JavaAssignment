package assignment3.polymorphism;

public class StringAdder extends IntAdder{
    String s1="Thought";
    String s2="Works";

    @Override
    public void concat() {
        System.out.println("Concat String : "+ (s1+s2));
    }



}
