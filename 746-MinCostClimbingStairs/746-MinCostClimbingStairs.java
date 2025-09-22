// Last updated: 9/22/2025, 6:57:46 PM
class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int dp[]=new int[cost.length+1];
        Arrays.fill(dp,-1);
        return Math.min(rec(cost,0,dp),rec(cost,1,dp));
    }
    public static int rec(int cost[],int i,int dp[])
    {
        if(i>=cost.length)
        {
            return 0;
        }
        if(dp[i]!=-1) return dp[i];
        return dp[i]=Math.min(rec(cost,i+1,dp),rec(cost,i+2,dp))+cost[i];
    }
}