package assignment3.polymorphism;

public class OverridingMerge extends OverridingAdd{
    String s1="Thought";
    String s2="Works";

    @Override
    public void addConcat() {
        System.out.println(s1+s2);
    }

    public static void main(String[] args) {
        
        // calling subclass merging method
        OverridingMerge merge= new OverridingMerge();
        merge.addConcat();

        // calling base class addition method
        OverridingAdd add= new OverridingAdd();
        add.addConcat();

    }
}
