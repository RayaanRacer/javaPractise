class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n= nums.length;
        int[] neg = new int[n/2];
        int[] pos = new int[n/2];
        int k =0;
        int j =0;
        for(int i=0;i<n; i++){
            if(nums[i]>0){
                pos[k] = nums[i];
                k++;
            }else{
                neg[j] = nums[i];
                j++;
            }
        }
        k=0;j=0;
        int[] num = new int[n];
        for(int i=0;i<n;i++){
            if(i%2==0){
                num[i]=pos[k];
                k++;
            }else{
                num[i]= neg[j];
                j++;
            }
        }
        return num;
    }
}
