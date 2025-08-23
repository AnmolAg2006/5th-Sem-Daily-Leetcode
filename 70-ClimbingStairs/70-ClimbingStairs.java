// Last updated: 8/23/2025, 10:30:19 PM
class Solution {
    public int climbStairs(int n) {
        int dp[]=new int[n+1];
        if(n<0)
        {
            return 0;
        }
        dp[0]=1;
        dp[1]=1;
        if(n<2)
        {
            return dp[n];
        }
        for(int i=2;i<=n;i++)
        {
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
}