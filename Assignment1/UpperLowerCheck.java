import java.util.Scanner;

public class UpperLowerCheck {
    public static void main(String[] args) {
        System.out.println("Please enter a character: ");
        Scanner sc =new Scanner(System.in);
        char input= sc.next().charAt(0);

        if (Character.isUpperCase(input)){
            System.out.println("The entered character is Upper case");
        }
        else if(Character.isLowerCase(input)){
            System.out.println("The entered character is Lower case");
        }
    }
}
