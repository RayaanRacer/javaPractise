import java.util.*;

public class Main {
    public static void largest(int[] arr){
      int max = Integer.MIN_VALUE;
      int maxVal = findL(arr, 0, max);
      System.out.print(maxVal);
    }
    public static int findL(int[] arr,int s, int max){
      if(s== arr.length) return max;
      if(max<arr[s]){
        max = arr[s];
      }
      return findL(arr, s+1, max);
    }
    public static void main(String[] args) {
      int[] arr = {1,3,6,8,2,7};
      largest(arr);
      
  }
}
