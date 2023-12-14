import java.util.*;

public class Main {
    public static void secL(int[] arr){
      int max = Integer.MIN_VALUE;
      int maxI =0;
      for(int i=0; i<arr.length; i++){
        if(max<arr[i]){
          max=arr[i];
          maxI =i;
        }
      }
      max = Integer.MIN_VALUE;
      for(int i=0; i<arr.length;i++){
        if(i==maxI){
          continue;
        }
        if(max<arr[i]){
          max=arr[i];
        }
      }
      System.out.println(max);
    }
    public static void main(String[] args) {
      int[] arr = {1,3,6,8,2,7};
      secL(arr);
      
  }
}
