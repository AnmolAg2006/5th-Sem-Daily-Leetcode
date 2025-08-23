// Last updated: 8/23/2025, 10:25:50 PM
class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int i=0;
        int j=nums.length-1;
        int result[]=new int [nums.length];
        int left=0;
        int right=j;
        for(;i<nums.length;i++,j--)
        {
            if(nums[i]<pivot)
            {
                result[left++]=nums[i];
            }
            if(nums[j]>pivot)
            {
                result[right--]=nums[j];
            }
        }
        while(left<=right)
        {
            result[left++]=pivot;
        }
        return result;
    }
}