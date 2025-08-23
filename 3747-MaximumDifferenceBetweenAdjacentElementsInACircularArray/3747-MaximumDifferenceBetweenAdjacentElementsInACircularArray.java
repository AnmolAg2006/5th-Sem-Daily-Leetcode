// Last updated: 8/23/2025, 10:23:55 PM
class Solution {
    public int maxAdjacentDistance(int[] nums) {
        int max=Integer.MIN_VALUE;
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            max=Math.max(Math.abs((nums[(i+1)%n])-nums[i]),max);
        }
        return max;
    }
}