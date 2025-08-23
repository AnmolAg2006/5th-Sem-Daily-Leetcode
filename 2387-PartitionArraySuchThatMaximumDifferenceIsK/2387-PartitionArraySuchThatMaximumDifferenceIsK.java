// Last updated: 8/23/2025, 10:25:36 PM
class Solution {
    public int partitionArray(int[] nums, int k) {
        Arrays.sort(nums);
        int idx=0;
        int ans=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]-nums[idx]>k)
            {
                idx=i;
                ans++;
            }
        }
        return ans+1;

    }
}