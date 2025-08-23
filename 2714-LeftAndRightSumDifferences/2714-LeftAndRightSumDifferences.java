// Last updated: 8/23/2025, 10:25:08 PM
class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n=nums.length;
        int ls[]=new int[n];
        int rs[]=new int[n];
        int ts=0;
        int j=0;
        for(int i=0;i<n;i++)
        {
            ts+=nums[i];
            ls[i]=j;
            j+=nums[i];
        }
        for(int i=0;i<n;i++)
        {
            rs[i]=ts-nums[i];
            ts-=nums[i];
        }
        for(int i=0;i<n;i++)
        {
            ls[i]=Math.abs(ls[i]-rs[i]);
        }
        return ls;
    }
}