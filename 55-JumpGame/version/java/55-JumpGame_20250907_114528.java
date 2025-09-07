// Last updated: 9/7/2025, 11:45:28 AM
class Solution {
    // public static boolean isPossible(int nums[],)
    public boolean canJump(int[] nums) {
        int n = nums.length;
        boolean dp[] = new boolean[n];
        dp[n - 1] = true;
        for (int i = n - 2; i >= 0; i--) {
            int farthest = Math.min(n - 1, i + nums[i]);
            for (int j = i + 1; j <= farthest; j++) {
                if (dp[j]) {
                    dp[i] = true;
                    break;
                }
            }
        }
        // for (int i = 0; i < n; i++) {
        //     System.out.print(dp[i] + " ");
        // }
        return dp[0];
    }
}