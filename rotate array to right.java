class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k=k%nums.length;
        int[] tempArr = new int[k];
        int r=0;
        for(int i=n-1;i>=n-k;i--){
            tempArr[r] = nums[i];
            r++;
        }
        int l = tempArr.length;
        for(int i=0;i<l/2;i++){
            int temp = tempArr[i];
            tempArr[i] = tempArr[l-i-1];
            tempArr[l-i-1] = temp;
        }
        for(int i=n-k-1;i>=0;i--){
            nums[i+k]=nums[i];
        }
        for(int i=0;i<k;i++){
            nums[i]=tempArr[i];
        }}}
       
