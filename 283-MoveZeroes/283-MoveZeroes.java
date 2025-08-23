// Last updated: 8/23/2025, 10:29:16 PM
class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int curIdx = 0;
        for(int i = 0; i < n; i++) {
            if (nums[i] != 0) {
                nums[curIdx++] = nums[i];
            }
        }
        while (curIdx < n) {
            nums[curIdx++] = 0; 
        }
    }
}