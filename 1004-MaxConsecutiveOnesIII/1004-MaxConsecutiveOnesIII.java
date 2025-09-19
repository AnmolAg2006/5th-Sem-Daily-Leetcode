// Last updated: 9/19/2025, 3:40:24 PM
class Solution {
    public int longestOnes(int[] nums, int k) {
        int n=nums.length;
        int l=0;
        int ans=0;
        int z=0;
        for(int r=0;r<n;r++)
        {
            if(nums[r]==0)
            {
                z++;
                if(z>k)
                {
                    // l++;
                    while(nums[l++]!=0)
                    {
                        continue;
                    }
                    z--;
                }
            }
            ans=Math.max(ans,r-l+1);
        }
        // c+=(r-l);
        System.out.print(l+" "+z);
        return ans;
    }
}