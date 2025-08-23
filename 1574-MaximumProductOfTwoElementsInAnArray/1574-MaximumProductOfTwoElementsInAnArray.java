// Last updated: 8/23/2025, 10:27:01 PM
class Solution {
    public int maxProduct(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        return ((nums[n-1]-1)*(nums[n-2]-1));
    }
}