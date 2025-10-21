// Last updated: 10/22/2025, 12:17:19 AM
class Solution {
    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        int[] ans = new int[queries.length];
        int sum = 0;

        for (int num : nums) {
            if (num % 2 == 0) sum += num;
        }

        for (int j = 0; j < queries.length; j++) {
            int val = queries[j][0];
            int idx = queries[j][1];

            if (nums[idx] % 2 == 0) {
                sum -= nums[idx];
            }

            nums[idx] += val;

            if (nums[idx] % 2 == 0) {
                sum += nums[idx];
            }

            ans[j] = sum;
        }

        return ans;
    }
}
