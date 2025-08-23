// Last updated: 8/23/2025, 10:24:20 PM
class Solution {
    public double minimumAverage(int[] nums) {
        Arrays.sort(nums);
        float arr[]=new float[nums.length/2];
        float min=Integer.MAX_VALUE;
        int j=0;
        for(int i=0;i<nums.length/2;i++)
        {
            // min=Math.min(min,((float)nums[nums.length-i-1]+nums[i])/2);
            // System.out.print(min+" ");
            arr[j++]=((float)nums[nums.length-i-1]+nums[i])/2;
        }
        for(int i=0;i<arr.length;i++)
        {
            min=Math.min(min,((float)nums[nums.length-i-1]+nums[i])/2);
        }
        return min;
    }
}