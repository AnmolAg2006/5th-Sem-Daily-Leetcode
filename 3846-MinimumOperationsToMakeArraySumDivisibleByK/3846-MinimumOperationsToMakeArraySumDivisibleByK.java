// Last updated: 8/23/2025, 10:23:47 PM
class Solution {
    public int minOperations(int[] nums, int k) {
        int sum=0;
        for(int i:nums)
        {
            sum+=i;
        }
        return sum%k;
    }
}