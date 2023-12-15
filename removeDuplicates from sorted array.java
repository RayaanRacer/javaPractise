class Solution {
    public int removeDuplicates(int[] nums) {
        int[] arr=new int[nums.length];
        arr[0]=nums[0];
        int next=1;
        int rep=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                rep++;
            }
            else{
                arr[next]=nums[i];
                next++;
            }
        }
        for(int i=0;i<next;i++){
            nums[i]=arr[i];
        }
        return next;
    }
}
