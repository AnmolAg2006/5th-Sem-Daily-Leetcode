// Last updated: 8/23/2025, 10:28:37 PM
class Solution {
    public static int fun(int nums[],int W,int sum,int i)
    {
        if(sum==W && i==nums.length)
            return 1;
        if(i==nums.length)
            return 0;
        return fun(nums,W,sum+nums[i],i+1)+fun(nums,W,sum-nums[i],i+1);
    }
    public int findTargetSumWays(int[] nums, int target) {
        int n=nums.length;
        // int dp[][]=new int[n+1][target+1];
        return fun(nums,target,0,0);
    }
}