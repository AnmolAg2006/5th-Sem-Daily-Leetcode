// Last updated: 8/23/2025, 10:24:00 PM
class Solution {
    public int countSubarrays(int[] nums) {
        int ans=0;
        for(int i=0;i<nums.length-2;i++)
        {
            if((float)nums[i+1]/2==(float)nums[i]+(float)nums[i+2])
            {
                ans++;
            }
        }
        return ans;
    }
}