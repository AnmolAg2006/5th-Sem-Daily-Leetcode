// Last updated: 8/23/2025, 10:24:06 PM
class Solution {
    public static int sum(int n)
    {
        int ans=0;
        while(n!=0)
        {
            ans+=n%10;
            n/=10;
        }
        return ans;
    } 
    public int minElement(int[] nums) {
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            nums[i]=sum(nums[i]);
            if(min>nums[i])
            {
                min=nums[i];
            }
        }
        return min;
        
    }
}