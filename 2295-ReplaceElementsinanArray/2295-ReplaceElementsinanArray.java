// Last updated: 10/21/2025, 4:18:10 PM
class Solution {
    public int[] arrayChange(int[] nums, int[][] operations) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            hm.put(nums[i],i);
        }
        for(int op[]:operations)
        {
            if(hm.containsKey(op[0])) {
                int idx=hm.get(op[0]);
                nums[idx]=op[1];
                hm.put(nums[idx],idx);
            }
        }
        return nums;
    }
}