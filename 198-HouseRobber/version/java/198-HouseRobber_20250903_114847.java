// Last updated: 9/3/2025, 11:48:47 AM
class Solution {
    public static int fun(int nums[],int vis[],int i) {
        if(i==nums.length||i==nums.length+1)
        {
            return 0;
        }
        if(vis[i]!=-1)
        {
            return vis[i];
        }
        vis[i]=Math.max(fun(nums,vis,i+2)+nums[i],fun(nums,vis,i+1));
        return vis[i];
    }
    public int rob(int[] nums) {
        if(nums.length==1)
        {
            return nums[0];
        }
        
        int dp[]=new int[nums.length];
        dp[0]=nums[0];
        dp[1]=Math.max(nums[0],nums[1]);
        for(int i=2;i<nums.length;i++)
        {
            dp[i]=Math.max(dp[i-1],dp[i-2]+nums[i]);
        }
        return dp[nums.length-1];
    }
}