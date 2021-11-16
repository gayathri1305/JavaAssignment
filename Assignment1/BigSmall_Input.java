import java.util.Scanner;

public class BigSmall_Input {
    public static void main(String[] args) {
        System.out.println("Please enter four numbers");
        Scanner sc= new Scanner(System.in);

        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        int number3 = sc.nextInt();
        int number4 = sc.nextInt();

        int smallest = number1;
        if(smallest > number2)
            smallest = number2;
        if(smallest > number3)
            smallest = number3;
        if(smallest>number4)
            smallest=number4;
        System.out.println("Small number is "+ smallest);

    }
}
