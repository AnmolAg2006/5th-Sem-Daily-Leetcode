// Last updated: 11/16/2025, 8:02:46 AM
class Solution {
    public int maximizeExpressionOfThree(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        return nums[n-1]+nums[n-2]-nums[0];
    }
}