package Test;

import java.util.Scanner;

public class ReturnString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your name :");
        String name = in.next();
        String greet = Greet(name);
        System.out.println(greet);
    }

    static String Greet(String hell) {
        String message = "Hello" + hell;
        return message;
    }
}
