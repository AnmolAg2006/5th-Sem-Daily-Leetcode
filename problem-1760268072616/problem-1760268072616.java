// Last updated: 10/12/2025, 4:51:12 PM
class Solution {
    public int longestSubarray(int[] nums) {
        if (nums.length < 3) {
            return nums.length;
        }
        int a = nums[0];
        int b = nums[1];
        int ans = 2;
        int curr = 2;
        for (int i = 2; i < nums.length; i++) {
            if (nums[i] == nums[i - 1] + nums[i - 2]) {
                curr++;
            } else {
                curr = 2;
            }
            ans = Math.max(curr, ans);
        }
        return ans;
    }
}