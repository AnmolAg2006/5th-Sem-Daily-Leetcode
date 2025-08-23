// Last updated: 8/23/2025, 10:24:27 PM
class Solution {
    public boolean isArraySpecial(int[] nums) {
        for(int i=0;i<nums.length-1;i++)
        {
            if(((nums[i]+nums[i+1])%2==0))
            {
                return false;
            }
        }
        return true;
    }
}