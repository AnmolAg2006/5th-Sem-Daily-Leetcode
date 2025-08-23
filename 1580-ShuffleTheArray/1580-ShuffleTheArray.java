// Last updated: 8/23/2025, 10:27:00 PM
class Solution {
    public int[] shuffle(int[] nums, int n) {
        int ans[]=new int[2*n];
        for(int i=0;i<n;i+=1)
        {
            ans[2*i]=nums[i];
            ans[2*i+1]=nums[n+i];
        }
        return ans;
    }
}