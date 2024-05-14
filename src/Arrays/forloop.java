package Arrays;

import java.util.Scanner;

public class forloop {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] array = new int[5];
        for(int i =0; i<array.length; i++) {
            array[i] = in.nextInt();
        }

        for(int i =0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
    }
}
