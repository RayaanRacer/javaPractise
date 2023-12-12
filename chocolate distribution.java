// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class HelloWorld {
    public static int chocolate(int[] nums, int m){
        int n= nums.length;
        if(n<m){
            return 0;
        }
        Arrays.sort(nums);
        int difference = Integer.MAX_VALUE;
        for(int i=0;i+m-1<n;i++){
            int diff = nums[i+m-1]-nums[i];
            difference = Math.min(diff,difference);
        }
        return difference;
    }
    public static void main(String[] args) {
        int[] arr = { 12, 4,  7,  9,  2,  23, 25, 41, 30,
                      40, 28, 42, 30, 44, 48, 43, 50 };
        System.out.println(chocolate(arr,7));
    }
}
