package Test;

import java.util.Scanner;

public class Largest_number {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter three numbers :");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        int max = a;
        if(max <b) {
            max = b;
        }
        if (max<c ){
            max = c;
        }
        System.out.println(max+ " is the largest");
    }
}
