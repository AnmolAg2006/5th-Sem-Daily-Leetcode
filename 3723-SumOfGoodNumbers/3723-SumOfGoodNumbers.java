// Last updated: 8/23/2025, 10:23:58 PM
class Solution {
    public int sumOfGoodNumbers(int[] nums, int k) {
        int ans=0;
        for(int i=0;i<nums.length;i++)
        {
            if((i-k>=0 && nums[i]<=nums[i-k])||(i+k<nums.length && nums[i]<=nums[i+k]))
            {
                continue;
            } 
            ans+=nums[i];
            
        }
        return ans;
    }
}