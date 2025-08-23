// Last updated: 8/23/2025, 10:29:55 PM
class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);   // [1,1,2,2,4]
        for(int i=1;i<nums.length;i+=2)
        {
            if(nums[i-1]!=nums[i])
            {
                return nums[i-1];
            }
        }
        return nums[nums.length-1];
    }
}