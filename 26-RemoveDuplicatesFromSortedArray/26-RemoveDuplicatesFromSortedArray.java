// Last updated: 8/23/2025, 10:30:42 PM
class Solution {
    public int removeDuplicates(int[] nums) {
        int s=1,i=0;
        while(++i<nums.length)
        {
            if(nums[i]!=nums[s-1])
            {
                nums[s++]=nums[i];
            }
        }
        return s;
    }
}