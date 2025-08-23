// Last updated: 8/23/2025, 10:26:04 PM
class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        int withIdx[][]=new int[nums.length][2];
        for(int i=0;i<nums.length;i++)
        {
            withIdx[i][0]=nums[i];
            withIdx[i][1]=i;
        }
        Arrays.sort(withIdx,(a,b)->b[0]-a[0]);
        Arrays.sort(withIdx,0,k,(a,b)->a[1]-b[1]);

        int ans[]=new int[k];
        for(int i=0;i<k;i++)
        {
            ans[i]=withIdx[i][0];
        }
        return ans;
    }
}