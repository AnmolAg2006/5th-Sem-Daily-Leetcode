// Last updated: 8/23/2025, 10:23:56 PM
class Solution {
    public int subarraySum(int[] nums) {
        int ans=0;
        for(int i=0;i<nums.length;i++)
        {
            for(int j=Math.max(0,i-nums[i]);j<=i;j++)
            {
                ans+=nums[j];
            }
        }
        return ans;
    }
}