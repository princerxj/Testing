package Test;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number :");
        int num = in.nextInt();
        int num1 = 0;
        int num2 = 1;
        int temp = 0;
        int n= 2;
        while ( n <= num) {
            temp = num1+num2;
            num1= num2 ;
            num2 = temp;
            n++;
        }
        System.out.println(""+temp);
    }
}
