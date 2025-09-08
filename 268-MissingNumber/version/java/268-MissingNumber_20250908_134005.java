// Last updated: 9/8/2025, 1:40:05 PM
class Solution {
    public int missingNumber(int[] nums) {
        ArrayList<Integer> hs = new ArrayList<>();
        for (int num : nums) {
            hs.add(num);
        }
        int i = 0;
        while (hs.contains(i++)) {
            continue;
        }
        return i-1;
    }
}