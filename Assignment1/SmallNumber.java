package com.basics;

import java.util.Scanner;

public class SmallNumber {
    public static void main(String[] args) {
        int number1 = 5;
        int number2 = 2;
        int number3 = -2;
        int number4 = 3;
        int smallest = number1;
        if(smallest > number2)
            smallest = number2;
        if(smallest > number3)
            smallest = number3;
        if(smallest>number4)
            smallest=number4;
        System.out.println("Small number is "+ smallest);




//        if (number1 < number2 && number1 < number3 && number1 < number4) {
//            System.out.println("Smallest number is " + number1);
//        }
//        if (number2 < number1 && number2 < number3 && number2 < number4) {
//            System.out.println("Smallest number is " + number2);
//        }
//        if (number3 < number1 && number3 < number2 && number3 < number4) {
//            System.out.println("Smallest number is " + number3);
//        }
//        if (number4 <number1 && number4 < number2 && number4 < number3) {
//            System.out.println("Smallest number is " + number4);
//        }

    }
}