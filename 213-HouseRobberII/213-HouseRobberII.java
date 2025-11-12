// Last updated: 11/12/2025, 12:14:39 PM
class Solution {
    public static int fun(int arr[],int i,int j,int dp[]) {
		if(i>j ) return 0;
		if(dp[i]!=-1) return dp[i];
		return dp[i]= Math.max(arr[i]+fun(arr,i+2,j,dp),fun(arr,i+1,j,dp));
	}
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==1) return nums[0];
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
        int ans1=fun(nums,0,n-2,dp);
        
        Arrays.fill(dp,-1);
        int ans2=fun(nums,1,n-1,dp);
        
        return Math.max(ans1,ans2);
    }
}