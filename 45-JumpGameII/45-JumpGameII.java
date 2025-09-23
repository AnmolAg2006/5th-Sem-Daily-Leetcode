// Last updated: 9/23/2025, 6:24:16 PM
class Solution {
    public int jump(int[] nums) {
        int n=nums.length;
        int dp[]=new int[n];
        dp[n-1]=0;
        for(int i=n-2;i>=0;i--)
        {
            int steps=nums[i],ans=Integer.MAX_VALUE;
            for(int j=i+1;j<=i+steps && j<nums.length;j++)
            {
                if(dp[j]!=-1)
                {
                    ans=Math.min(ans,dp[j]+1);
                }
            }
            dp[i]=(ans==Integer.MAX_VALUE)?-1:ans;
        }
        return dp[0];
    }
}