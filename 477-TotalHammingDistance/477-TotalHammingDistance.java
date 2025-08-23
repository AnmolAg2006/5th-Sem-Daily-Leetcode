// Last updated: 8/23/2025, 10:28:40 PM
class Solution {
    public int totalHammingDistance(int[] nums) {
        int ans=0;
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                ans+=Integer.bitCount(nums[i]^nums[j]);
            }
        }
        return ans;
    }
}