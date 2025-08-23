// Last updated: 8/23/2025, 10:26:59 PM
class Solution {
    public int[] runningSum(int[] nums) {
        int s=0;
        for(int i=0;i<nums.length;i++)
        {
            nums[i]=s+nums[i];
            s=nums[i];
        }
        return nums;
    }
}