import java.util.*;

public class Main {
  public static int left(int[] arr, int j){
    if(j<0){
      return 0;
    }
    if(arr[j]<left(arr,j-1)){
      System.out.print(arr[j-1]+" ");
      return arr[j-1];
    }
    return arr[j];
  }

    public static void main(String[] args) {
      int[] arr = {10, 22, 12, 3, 0, 6};
      left(arr,arr.length-1);
      System.out.print(arr[arr.length-1]+" ");
  }
}
