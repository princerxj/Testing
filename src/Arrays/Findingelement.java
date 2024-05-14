package Arrays;

import java.util.Scanner;

public class Findingelement {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int flag = 0;
        int[] array = new int[5];
        System.out.println("Enter the elements of array : ");
        for(int i = 0; i<array.length ; i++) {
            array[i] = in.nextInt();
        }
        System.out.println("Enter a number:");
        int num = in.nextInt();

        for(int i = 0; i<array.length; i++) {
            if(array[i]==num) {
                System.out.println(num+" is present at index number " +i);
                flag++;
            }
        }
        if(flag==0) {
            System.out.println(num+" is not present in the array");
        }
    }
}
