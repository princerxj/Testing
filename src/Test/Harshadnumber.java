package Test;

import java.util.Scanner;

public class Harshadnumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("x = ");
        int x = in.nextInt();
        int t = x;
        int sum = 0,rem;
        while( x != 0 ) {
            rem = x%10;
            sum = sum+rem;
            x = x/10;
        }
        int temp = sum;
        if(t%temp==0) {
            System.out.println(temp);
        }
        else {
            System.out.println(-1);
        }

    }
}
