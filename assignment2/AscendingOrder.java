package assignment2;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class AscendingOrder {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the number: ");
        int num=sc.nextInt();
        //convert int to string
        String inputString= Integer.toString(num);
        //convert string to char array
        char[] charArray =inputString.toCharArray();
        //sorting the char array
        Arrays.sort(charArray);
        //Append each character into string builder object then display as string
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<charArray.length;i++){
           sb.append(charArray[i]);
        }

        System.out.println(sb);
    }
}
