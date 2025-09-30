// Last updated: 9/30/2025, 6:14:02 PM
class Solution {
    public int triangularSum(int[] nums) {
        int l=nums.length-1;
        while(l-->0)
        {
            for(int i=0;i<=l;i++)
            {
                nums[i]=(nums[i]+nums[i+1])%10;
            }
        }
        return nums[0];
    }
}