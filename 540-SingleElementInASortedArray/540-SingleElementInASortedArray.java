// Last updated: 8/23/2025, 10:28:32 PM
class Solution {
    public int singleNonDuplicate(int[] nums) {
        int i=0;
        int j=nums.length-1;
        while(i<j)
        {
            if(nums[i]==nums[i+1] )
            {
                i+=2;
            }
            else if(nums[j]==nums[j-1])
            {
                j-=2;
            }
            else{
                return nums[i];
            }
        }
        return nums[i];
    }
}