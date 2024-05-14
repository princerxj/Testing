package Test;

import java.util.Scanner;

public class Occurence {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number :");
        int num = in.nextInt();
        System.out.println("Enter a find of which occurence to find:");
        int n = in.nextInt();
        int count = 0;

        while(num > 0) {
            if (num%10 == n) {
                count++ ;
            }
            num = num/10;
        }
        System.out.println(count);

    }
}
