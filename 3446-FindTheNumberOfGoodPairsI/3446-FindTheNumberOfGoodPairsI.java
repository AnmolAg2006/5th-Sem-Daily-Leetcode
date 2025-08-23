// Last updated: 8/23/2025, 10:24:25 PM
class Solution {
    public int numberOfPairs(int[] nums1, int[] nums2, int k) {
        int c=0;
        for(int i=0;i<nums1.length;i++)
        {
            for(int j=0;j<nums2.length;j++)
            {
                if(nums1[i]%(nums2[j]*k)==0)
                {
                    c++;
                }
            }
        }
        return c;
    }
}