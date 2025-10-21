// Last updated: 10/22/2025, 1:16:22 AM
class Solution {
    public long[] findPrefixScore(int[] nums) {
        long[]ans=new long[nums.length];
        long max=nums[0];
        ans[0]=nums[0]*2;
        for(int i=1;i<nums.length;i++)
        {
            max=Math.max(max,nums[i]);
            ans[i]=nums[i]+max+ans[i-1];
        }
        return ans;
    }
}