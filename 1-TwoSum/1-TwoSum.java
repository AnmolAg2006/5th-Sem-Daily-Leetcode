// Last updated: 8/23/2025, 10:30:53 PM
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hs=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            if(hs.containsKey(target-nums[i]))
            {
                return new int[]{i,hs.get(target-nums[i])};
            }

            hs.put(nums[i],i);
        }
        return new int[]{};
    }
}