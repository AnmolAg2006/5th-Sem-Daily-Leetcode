// Last updated: 11/26/2025, 4:06:40 PM
class Solution {
    public long maxTotalValue(int[] nums, int k) {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i:nums){
            min=Math.min(min,i);
            max=Math.max(max,i);
        }
        return (long)k*(max-min);
    }
}