import java.util.*;

public class Main {
  
    public static void selection(int[] arr){
      int n = arr.length;
      for(int i=0; i<n-1; i++){
        int min=i;
        for(int j=i+1;j<n; j++){
          if(arr[j]<arr[min]){
            min =j;
          }
        }
        if(i!=min){
          int temp = arr[min];
          arr[min] = arr [i];
          arr[i] = temp;
        }
      }
    }
    public static void main(String[] args) {
      
      int[] arr = {3,5,6,2,7,1,0};
      selection(arr);
      for(int i:arr){
        System.out.print(i+" ");
      }
      
  }
}
