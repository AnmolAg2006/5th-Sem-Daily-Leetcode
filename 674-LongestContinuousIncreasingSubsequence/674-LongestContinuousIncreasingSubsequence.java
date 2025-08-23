// Last updated: 8/23/2025, 10:28:14 PM
class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int ans=1;
        int c=1;
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i+1]<=nums[i])
            {
                ans=Math.max(c,ans);
                c=1;
            }
            else{
                c++;
            }
        }
        return Math.max(c,ans);
    }
}