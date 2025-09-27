// Last updated: 9/27/2025, 5:57:52 PM
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=m-1;
        int j=n-1;
        int ans=n+m-1;
        while(i>=0 && j >= 0)
        {
            if(nums1[i]<nums2[j])
            {
                nums1[ans]=nums2[j];
                j--;
            }
            else {
                nums1[ans]=nums1[i];
                i--;

            }
            ans--;
        }
        while(j>=0)
        {
            nums1[ans--]=nums2[j--];
        }
    }
}