// Last updated: 8/23/2025, 10:25:19 PM
class Solution {
    public int maximumCount(int[] nums) {
        int p=0;
        int n=0;
        for(int i:nums)
        {
            if(i<0)
            {
                n++;
            }
            else if(i>0)
            {
                p++;
            }
        }
        return Math.max(n,p);
    }
}