// Last updated: 8/23/2025, 10:24:04 PM
class Solution {
    public int minOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int mini = nums[0];
        if (mini < k) return -1;

        int cnt = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > k) {
                cnt++;
                while (i + 1 < nums.length && nums[i] == nums[i + 1]) 
                    i++;
            }
        }
        return cnt;
    }
}