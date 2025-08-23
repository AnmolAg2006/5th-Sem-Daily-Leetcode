// Last updated: 8/23/2025, 10:28:03 PM
class Solution {
    public int search(int[] nums, int target) {
        int ans=-1;
        int lo=0;
        int hi=nums.length-1;
        while(lo<=hi)
        {
            int mid=(lo+hi)/2;
            if(nums[mid]>target)
            {
                hi=mid-1;
            }
            else if(nums[mid]<target){
                lo=mid+1;
            }
            if(nums[mid]==target){
                return mid;
            }
        }
        return -1;
    }
}