// Last updated: 8/23/2025, 10:27:40 PM
class Solution {
    public int repeatedNTimes(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) {
                return num;
            }
            set.add(num);
        }
        return 0; // Should never reach here if input constraints are met.
    }
}