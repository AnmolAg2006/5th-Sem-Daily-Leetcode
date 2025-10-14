// Last updated: 10/14/2025, 8:11:52 AM
class Solution {
    public static boolean isValid(List<Integer> nums,int i, int k)
    {
        for(int j=i;j<i+k-1;j++)
        {
            if(nums.get(j+1)<=nums.get(j)) return false;
        }
        return true;
    }
    public boolean hasIncreasingSubarrays(List<Integer> nums, int k) {
        int n=nums.size();
        int i=0;
        while (i + 2*k <= n)
        {
            if(isValid(nums,i,k) && isValid(nums,i+k,k))
            {
                return true;
            }
            i++;
        }
        return false;
    }
}