// Last updated: 8/23/2025, 10:26:19 PM
class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int max=0;
        int i=0;
        int j=nums.length-1;
        while(i<j)
        {
            max=Math.max(max,nums[j]+nums[i]);
            i++;
            j--;
        }
        return max;
    }
}