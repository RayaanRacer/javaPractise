import java.util.*;

public class Main {
  
    public static void bubble(int[] arr){
      int n = arr.length;
      for(int i= n-1; i>0; i--){
        for(int j=0; j<i; j++){
          if(arr[j+1]<arr[j]){
            int temp = arr[j+1];
            arr[j+1] = arr[j];
            arr[j] = temp;
          }
        }
      }
    }
    public static void main(String[] args) {
      
      int[] arr = {3,5,6,2,7,1,0};
      bubble(arr);
      for(int i:arr){
        System.out.print(i+" ");
      }
      
  }
}
