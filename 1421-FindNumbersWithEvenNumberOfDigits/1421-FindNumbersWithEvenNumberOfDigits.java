// Last updated: 8/23/2025, 10:27:18 PM
class Solution {
    public static boolean isEven(int i)
    {
        int c=0;
        while(i!=0)
        {
            i/=10;
            c++;
        }
        if(c%2==0)
        {
            return true;
        }
        return false;
    }
    public int findNumbers(int[] nums) {
        int c=0;
        for(int i:nums)
        {
            if(isEven(i))
            {
                c++;
            }
        }
        return c;
    }
}