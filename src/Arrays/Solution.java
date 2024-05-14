package Arrays;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int[] nums = new int[5];
            System.out.println("");
            for(int i = 0;i<nums.length;i++) {
                nums[i] = in.nextInt();
            }
            int count =0,flag=0;
            for(int i=0;i<nums.length;i++) {
                while(nums[i] != 0 ) {
                    if(nums[i] != 0 ) {
                        count++;
                    }
                    nums[i] = nums[i]/10;
                }
                if(count%2==0) {
                    flag++;
                }
            }
        System.out.println(flag);


    }
}
