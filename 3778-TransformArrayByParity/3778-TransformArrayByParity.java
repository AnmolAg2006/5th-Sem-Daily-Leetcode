// Last updated: 8/23/2025, 10:23:51 PM
class Solution {
    public int[] transformArray(int[] nums) {
        int ans[]=new int[nums.length];
        int e=0,o=0;
        for(int el:nums)
        {
            if(el%2==0)
            {
                e++;
            }
            else{
                o++;
            }
        }
        int i=0;
        while(e--!=0)
        {
            ans[i++]=0;
        }
        while(o--!=0)
        {
            ans[i++]=1;
        }
        return ans;
    }
}