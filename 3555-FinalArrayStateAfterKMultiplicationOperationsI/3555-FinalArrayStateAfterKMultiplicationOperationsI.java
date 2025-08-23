// Last updated: 8/23/2025, 10:24:11 PM
class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        for(int i=0;i<k;i++)
        {
            int min=0;
            int l=nums.length;
            for(int j=0;j<l;j++)
            {
                if(nums[j]<nums[min])
                {
                    min=j;
                }
            }
            nums[min]*=multiplier;
        }
        
        return nums;
    }
}