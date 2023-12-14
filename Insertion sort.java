import java.util.*;

public class Main {
  
    public static void insertion(int[] arr){
      int n = arr.length;
      for(int i=0;i<n; i++){
        int j=i;
        while(j>0 && arr[j-1]>arr[j]){
            int temp= arr[j-1];
            arr[j-1] = arr[j];
            arr[j] = temp;
          j--;
        }
      }
    }
    public static void main(String[] args) {
      
      int[] arr = {3,5,6,2,7,1};
      insertion(arr);
      for(int i:arr){
        System.out.print(i+" ");
      }
      
  }
}
