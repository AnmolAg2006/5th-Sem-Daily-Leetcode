// Last updated: 8/23/2025, 10:28:26 PM
class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int ans=0;
        for(int i=0;i<nums.length;i+=2)
        {
            ans+=nums[i];
        }
        return ans;
    }
}