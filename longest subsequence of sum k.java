import java.util.*;

public class Main {
    public static void main(String[] args) {
      int[] arr = {2,3,5};
      int k = 5;
      int n = arr.length;
      int start = 0;
      int end = 0;
      int sum = arr[0];
      int maxlen = 0;
      while(end<n){
        while(k<sum && start<= end){
          sum -= arr[start];
          start++;
        }
        if(sum == k){
          maxlen = Math.max(maxlen, end - start +1);
        }
        end++;
        if(end<n) sum +=arr[end];
      }
      System.out.println(maxlen);
  }
}
