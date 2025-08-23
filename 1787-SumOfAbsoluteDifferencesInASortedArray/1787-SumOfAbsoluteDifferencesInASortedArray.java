// Last updated: 8/23/2025, 10:26:41 PM
class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int n=nums.length; //     3
        int c[]=new int [n+1]; // [0,2,5,10]
        int ans[]=new int [n];
        for(int i=1;i<=n;i++)
        {
            c[i]=c[i-1]+nums[i-1];
        }
        for(int i=0;i<n;i++)
        {
            ans[i]=(i)*nums[i]-c[i]+(c[n]-c[i+1])-nums[i]*(n-i-1);
        }
        return ans;
    }
}