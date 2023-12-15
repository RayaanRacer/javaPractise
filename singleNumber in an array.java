class Solution {
    public int singleNumber(int[] nums) {
        int n= nums.length;
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i=0; i<n; i++){
            if(hm.containsKey(nums[i])){
                hm.put(nums[i],hm.get(nums[i])+1);
            }else{
                hm.put(nums[i],0);
            }
        }
        for(HashMap.Entry<Integer, Integer> entry: hm.entrySet()){
            if(entry.getValue()==0){
                return entry.getKey();
            }
        }
        return -1;
    }
}
