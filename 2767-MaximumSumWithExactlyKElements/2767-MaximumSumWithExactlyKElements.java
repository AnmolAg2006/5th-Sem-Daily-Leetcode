// Last updated: 8/23/2025, 10:25:00 PM
class Solution {
    public int maximizeSum(int[] nums, int k) {
        int max=0;
        for(int i:nums)
        {
            max=Math.max(max,i);
        }
        return max*k+(k*(k-1)/2);
    }
}