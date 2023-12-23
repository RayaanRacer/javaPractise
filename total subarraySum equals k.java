class Solution {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        int count=0;
        for(int i=0;i<n;i++){
            int sum =0;
            for(int j=i;j<n;j++){
                sum+=nums[j];
                if(sum == k){
                    count++;
                }
            }
        }
        return count;
        // if(n==0) return 0;
        // if(n==1 &&  nums[0]!=k) return 0; 
        // while(m<n){
        //     sum+=nums[m];
        //     while(sum>k){
        //         if(f<n){
        //             sum -=nums[f];
        //             f++;
        //         }
        //     }
        //     if(sum==k){
        //         count++;
    //             m++;
    //         }else{
    //             m++;
    //         }
    //     }
    // return count;
    }
}
