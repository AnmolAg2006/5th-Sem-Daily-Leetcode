// Last updated: 8/23/2025, 10:29:46 PM
class Solution {
    public int maximumGap(int[] nums) {
        // if(nums.length<2)
        // {
        //     return 0;
        // }
        int max=0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++)
        {
            // if(arr[i+1]-arr[i]>max)
            // {
            //     ma
            // }
            max=Math.max(Math.abs(nums[i+1]-nums[i]),max);
        }
        // if(nums.length==2)
        // {
        //     return nums[1]-nums[0];
        // }
        return max;
    }
}