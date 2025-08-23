// Last updated: 8/23/2025, 10:29:45 PM
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i=0;
        int j=nums.length-1;
        while(nums[i]+nums[j]!=target)
        {
            if(nums[i]+nums[j]>target)
            {
                j--;
            }
            else if(nums[j]+nums[i]<target)
            {
                i++;
            }
            else{

                return new int[]{i+1,j+1};
            }
        }
        return new int[]{i+1,j+1};
    }
}