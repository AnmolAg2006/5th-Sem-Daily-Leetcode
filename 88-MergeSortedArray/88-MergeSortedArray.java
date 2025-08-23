// Last updated: 8/23/2025, 10:30:12 PM
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int i=m;i<m+n;i++)
        {
            nums1[i]=nums2[i-m];
        }
        Arrays.sort(nums1);
    }
}