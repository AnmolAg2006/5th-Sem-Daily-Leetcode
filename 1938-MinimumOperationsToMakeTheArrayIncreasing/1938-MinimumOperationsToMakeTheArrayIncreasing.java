// Last updated: 8/23/2025, 10:26:25 PM
class Solution {
    public int minOperations(int[] nums) {
        int ans=0;
        int prev=0;
        for(int i:nums)
        {
            if(i<=prev)
            {
                ans+=prev-i+1;
                prev++;
                // prev++;
            }
            else{
                prev=i;
            }
        }
        return ans;
    }
}