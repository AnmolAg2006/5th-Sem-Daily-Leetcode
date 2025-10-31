// Last updated: 10/31/2025, 4:48:58 PM
class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int n=nums.length;
        int count=0;
        int[] ans=new int[n];
        int[] res=new int[2];
        for(int i=0;i<n;i++)
        {
            ans[nums[i]]++;

        }
        int k=0;
        for(int i=0;i<n;i++)
        {
            if(ans[i]==2)
            {
                res[k]=i;
                k++;
            }
        }
        return res;
        
    }
}