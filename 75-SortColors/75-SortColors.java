// Last updated: 8/23/2025, 10:30:17 PM
class Solution {
    public void sortColors(int[] nums) {
        int c[]=new int [3];
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            c[nums[i]]++;
        }
        int c1=0;
        for(int i=0;i<3;i++)
        {
            while(c[i]!=0)
            {
                nums[c1++]=i;
                c[i]--;
            }
        }
    }
}