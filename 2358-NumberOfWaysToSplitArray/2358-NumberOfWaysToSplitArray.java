// Last updated: 8/23/2025, 10:25:42 PM
class Solution {
    public int waysToSplitArray(int[] nums) {
        int n=nums.length;
        long total=0;
        for(int i=0;i<n;i++)
        {
            total+=nums[i];
        }
        int ans=0;
        long ls=0;
        long rs=0;
        for(int i=0;i<n-1;i++)
        {
            ls+=nums[i];
            rs=total-ls;
            if(ls>=rs)
            {
                ans++;
            }
        }
        return ans;
    }
}