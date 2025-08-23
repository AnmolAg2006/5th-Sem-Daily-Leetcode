// Last updated: 8/23/2025, 10:30:37 PM
class Solution {
    public static int leftFind(int nums[],int target)
    {
        int i=0;
        int j=nums.length-1; // 5
        int result=-1;
        while(i<=j)
        {
            int mid=(i+j)/2;
            if(nums[mid]==target)
            {
                if(mid>0 && nums[mid]==nums[mid-1]) j=mid-1; 
                else {result=mid;
                break;}
            }
            
            else if(nums[mid]<target)
            {
                i=mid+1;
            }
            else{
                j=mid-1;
            }
        }
        return result;
    }
    public static int rightFind(int nums[],int target)
    {
        int i=0;
        int j=nums.length-1; // 5
        int result=-1;
        while(i<=j)
        {
            int mid=(i+j)/2;
            if(nums[mid]==target)
            {
                if(mid+1<nums.length && nums[mid]==nums[mid+1]) i=mid+1;
                else {
                    result=mid;
                    break;
                } 
            }
            else if(nums[mid]<target)
            {
                i=mid+1;
            }
            else{
                j=mid-1;
            }
        }
        return result;
    }
    public int[] searchRange(int[] nums, int target) {
        int i=0;
        int j= nums.length-1; // 5
        int ans[]=new int[2];
        ans[0]=leftFind(nums,target);
        ans[1]=rightFind(nums,target);
        return ans;
        
    }
}