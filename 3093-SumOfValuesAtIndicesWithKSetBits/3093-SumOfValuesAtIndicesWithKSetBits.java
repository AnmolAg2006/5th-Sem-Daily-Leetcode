// Last updated: 8/23/2025, 10:24:45 PM
class Solution {
    public static boolean isValid(int n,int k)
    {
        String s=Integer.toBinaryString(n);
        int c=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='1')
            {
                c++;
            }
        }
        if(c==k)
        {
            return true;
        }
        return false;
    }
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int ans=0;
        for(int i=0;i<nums.size();i++)
        {
            if(isValid((i),k))
            {
                ans+=nums.get(i);
            }
        }
        return ans;
    }
}