// Last updated: 8/23/2025, 10:24:56 PM
class Solution {
    public int sumOfSquares(int[] nums) {
        int n=nums.length;
        int ans=0;
        for(int i=0;i<n;i++)
        {
            if(n%(i+1)==0)
            {
                ans+=nums[i]*nums[i];
            }
        }
        return ans;
    }
}