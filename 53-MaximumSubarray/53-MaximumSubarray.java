// Last updated: 8/23/2025, 10:30:25 PM
class Solution {
    public int maxSubArray(int[] nums) {
        int sum=nums[0];

        int i=1;
        int ans=nums[0];
        while(i!=nums.length)
        {
            if(sum<0 ) 
            {
                sum=0;
            }
            sum+=nums[i];
            ans=Math.max(ans,sum);
            i++;
        }
        return ans;
    }
}