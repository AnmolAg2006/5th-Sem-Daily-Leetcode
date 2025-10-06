// Last updated: 10/6/2025, 7:11:27 PM
class Solution {
    public int longestSubsequence(int[] nums) {
        int ans = 0;
        boolean z = true;

        for (int x : nums) {
            ans ^= x;
            if (x != 0) z = false;
        }

        if (z) return 0;       
        return (ans == 0) ? nums.length - 1 : nums.length;
    }
}
