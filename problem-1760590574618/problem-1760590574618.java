// Last updated: 10/16/2025, 10:26:14 AM
class Solution {
    public int minOperations(int[] nums) {
        boolean isDiff=false;
        for(int i=0;i<nums.length-1;i++)
            {
                if(nums[i+1]!=nums[i])
                {
                    isDiff=true;
                    break;
                }
            }
        return (isDiff)?1:0;
    }
}