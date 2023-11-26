class Solution {
    public void rotate(int[] nums, int k) {
        int n= nums.length-1;
        k=k%nums.length;
        for(int i=0;i<(n+2)/2;i++){
            int temp=nums[i];
            nums[i]=nums[n-i];
            nums[n-i]=temp;
        }
        for(int j=0;j<k/2;j++){
            int temp = nums[k-j-1];
            nums[k-j-1] = nums[j];
            nums[j] = temp;
        }
        int s=k;
        int l=n;
        while(s<l){
            int temp = nums[s];
            nums[s] = nums[l];
            nums[l] = temp;
            s++;
            l--;
        }
    }
}
