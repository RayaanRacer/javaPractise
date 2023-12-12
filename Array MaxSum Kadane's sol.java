class Solution {
    public int maxSubArray(int[] nums) {
        int currsum = 0;
        int maxsum = Integer.MIN_VALUE;
        int min = Integer.MIN_VALUE;
        boolean check = true;
        for(int i=0; i< nums.length;i++){
            if(nums[i]>=0){
                check = false;
            }else{
                min = Math.max(min, nums[i]);
            }
            currsum = currsum + nums[i];
            if(currsum<0){
                currsum = 0;
            }
            maxsum = Math.max(maxsum, currsum);
        }
        if(check){
            return min;
        }
        return maxsum;
    }
}
