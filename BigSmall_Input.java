import java.util.Scanner;

public class BigSmall_Input {
    public static void main(String[] args) {
        System.out.println("Please enter four numbers");
        Scanner sc= new Scanner(System.in);

        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        int number3 = sc.nextInt();
        int number4 = sc.nextInt();

        if (number1 < number2 && number1 < number3 && number1 < number4) {
            System.out.println("Smallest number is " + number1);
        }
        if (number2 < number1 && number2 < number3 && number2 < number4) {
            System.out.println("Smallest number is " + number2);
        }
        if (number3 < number1 && number3 < number2 && number3 < number4) {
            System.out.println("Smallest number is " + number3);
        }
        if (number4 <number1 && number4 < number2 && number4 < number3) {
            System.out.println("Smallest number is " + number4);
        }

    }
}
