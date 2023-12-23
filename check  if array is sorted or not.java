class Solution {
    public boolean check(int[] nums) {
        int j =0;
        int n= nums.length;
        for(int i=0;i<n-1;i++){
            if(nums[i+1]<nums[i]){
                j=i+1;
                break;
            }
        }
        if(j==0) return true;
        if(nums[j]>nums[0]) return false;
        for(int i=j;i<n-1;i++){
            if(nums[i+1]<nums[i] || nums[i+1]>nums[0]){
                return false;
            }
        }
        return true;
    }
}
