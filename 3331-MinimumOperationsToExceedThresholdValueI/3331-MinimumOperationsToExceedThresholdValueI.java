// Last updated: 8/23/2025, 10:24:37 PM
class Solution {
    public int minOperations(int[] nums, int k) {
        // Arrays.sort(nums);
        int c=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]<k)
            {
            c++;
            }
        }
                return c;
    }
}