import java.util.*;
class MergeSort{
    static void merge(int[] arr, int s, int mid, int e){
        int n1 = mid-s+1;
        int n2 = e-mid;
        int[] a1 = new int[n1];
        int[] a2 = new int[n2];
        for(int i=0;i<a1.length; i++){
            a1[i]=arr[s+i];
        }
        for(int j=0;j<a2.length; j++){
            a2[j]=arr[mid+1+j];
        }
        int i=0; int j=0;int k=s;
        while(i<n1 && j<n2){
            if(a1[i]>=a2[j]){
                arr[k]=a2[j];
                j++;
            }else{
                arr[k]=a1[i];
                i++;
            }
            k++;
        }
        while(i<n1){
            arr[k]=a1[i];
            i++;
            k++;
        }
        while(j<n2){
            arr[k]=a2[j];
            j++;
            k++;
        }
    }
    static void sort(int[] arr, int s, int e){
        if(s<e){
            int mid = s +(e-s)/2;
            sort(arr,s,mid);
            sort(arr,mid+1,e);
            merge(arr,s,mid,e);
        }

    }
    public static void main(String[] args){
        int[] arr ={1,3,2,5,4,0};
        sort(arr,0,arr.length-1);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
