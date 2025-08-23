// Last updated: 8/23/2025, 10:28:53 PM
class Solution {
    public boolean canPartition(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i];
        }
        if(sum%2!=0)
            return false;
        int W=sum/2;
        int n=nums.length;
        boolean dp[][]=new boolean[n+1][W+1];
        for(int i=0;i<dp.length;i++)
        {
           dp[i][0]=true;
        }
        for(int i=1;i<dp.length;i++)
        {
            for(int j=1;j<dp[0].length;j++)
            {
                int w=nums[i-1];
                if(j>=w) {
                    dp[i][j]=dp[i-1][j-w]||dp[i-1][j];
                } else {
                    dp[i][j]=dp[i-1][j];
                }

            }
        }
        return dp[n][W];
    }
}