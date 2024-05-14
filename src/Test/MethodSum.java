package Test;

import java.util.Scanner;

public class MethodSum {
    public static void main(String[] args) {
        Sum();
    }
    static void Sum() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 1st number :");
        int a = in.nextInt();
        System.out.println("Enter 2nd number :");
        int b = in.nextInt();
        int sum = a+b;
        System.out.println("The sum is "+sum);
    }
}
