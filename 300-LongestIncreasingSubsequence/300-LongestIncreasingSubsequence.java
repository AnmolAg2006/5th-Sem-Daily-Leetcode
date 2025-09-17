// Last updated: 9/17/2025, 12:01:10 PM
class Solution {
    public static int lcs(int nums1[],int nums2[],int i,int j,int dp[][])
    {
        if(i==nums1.length || j==nums2.length)
        {
            return 0;
        }
        if(dp[i][j]!=-1) return dp[i][j];
        if(nums1[i]==nums2[j])
        {
            return dp[i][j]=1+lcs(nums1,nums2,i+1,j+1,dp);
        }
        else{
            return dp[i][j]=Math.max(lcs(nums1,nums2,i,j+1,dp),lcs(nums1,nums2,i+1,j,dp));
        }
    }
    public int lengthOfLIS(int[] nums) {
        int[] arr = Arrays.stream(nums).distinct().sorted().toArray();

        int dp[][]=new int[arr.length][nums.length];
        for(int a[]:dp)
        {
            Arrays.fill(a,-1);
        }
        return lcs(arr,nums,0,0,dp);
    }
}