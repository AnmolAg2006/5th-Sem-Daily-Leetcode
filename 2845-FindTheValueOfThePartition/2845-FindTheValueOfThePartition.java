// Last updated: 8/23/2025, 10:24:54 PM
class Solution {
    public int findValueOfPartition(int[] nums) {
        Arrays.sort(nums);
        int min=nums[1]-nums[0];
        for(int i=1;i<nums.length-1;i++)
        {
            min=Math.min(min,(nums[i+1]-nums[i]));
        }
        return min;
    }
}