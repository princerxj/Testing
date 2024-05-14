package Test;

import java.util.Scanner;

public class Returnsum {
    public static void main(String[] args) {
        int ans = sum(12,14);
        System.out.println(ans);
    }
    static int sum(int a ,int b){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 1st number : ");
        a = in.nextInt();
        System.out.println("Enter 2nd number : ");
        b = in.nextInt();
        int sum = a+b;
        return sum;
    }

}
