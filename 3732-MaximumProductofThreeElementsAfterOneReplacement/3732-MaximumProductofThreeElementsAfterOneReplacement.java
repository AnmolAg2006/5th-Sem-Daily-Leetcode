// Last updated: 11/16/2025, 9:09:51 PM
class Solution {
    public long maxProduct(int[] nums) {
        long max1=0;
        long max2=0;
        for(int i:nums)
        {
            i=Math.abs(i);
            if(i>max1)
            {
                max2=max1;
                max1=i;
            }
            else if(i>max2)
            {
                max2=i;
            }
        }
        return max1*max2*100000;
    }   
}