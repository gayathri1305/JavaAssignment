package assignment2;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        while(true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Please enter first number: ");
            int num1=sc.nextInt();
            System.out.println("Please enter  second number: ");
            int num2=sc.nextInt();
            optionList();
            int option= sc.nextInt();

            if(option<1 || option>4){
                System.out.println("please enter the valid operation ");
                optionList();
            }

            if(option==1)
                add(num1,num2);
            if(option==2)
                sub(num1,num2);
            if(option==3)
                mul(num1,num2);
            if(option==4)
                div(num1,num2);
        }


    }
    public static void optionList(){
        System.out.println("Please enter the number :\n"
                + " 1 --> Addition \n"
                +  " 2 -->Subtraction \n"
                +  " 3 -->Multiplication \n"
                +  " 4 -->Division \n");
    }

    public static void add(int a,int b){
        System.out.println("Result of "+ a + " + "+ b + " = " + (a+b));
    }
    public static void sub(int a,int b){
        System.out.println("Result of "+ a + " - "+ b + " = " + (a-b));
    }
    public static void mul(int a,int b){
        System.out.println("Result of "+ a + " * "+ b + " = " + (a*b));
    }
    public static void div(int a,int b){
        System.out.println("Result of "+ a + " / "+ b + " = " + (a/b));
    }


}
