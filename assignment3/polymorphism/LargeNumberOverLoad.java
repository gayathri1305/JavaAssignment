package assignment3.polymorphism;

public class LargeNumberOverLoad {
    public static void main(String[] args) {
        LargeNumberOverLoad l= new LargeNumberOverLoad();
        l.largeNumber(-5,5);
        l.largeNumber(4,5,6);
    }

    public void largeNumber(int a, int b){
        if(a>b){
            System.out.println("The large number is "+ a);
        }
        else{
            System.out.println("The large number is "+ b);
        }
    }
    public void largeNumber(int a, int b,int c){
        int largeNumber=a;
        if(largeNumber<b){
            largeNumber = b;
        }
        if(largeNumber<c){
            largeNumber = c;
        }
        System.out.println("The Large number is "+ largeNumber);
    }
}
