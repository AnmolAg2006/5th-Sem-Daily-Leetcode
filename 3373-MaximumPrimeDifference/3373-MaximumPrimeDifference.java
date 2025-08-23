// Last updated: 8/23/2025, 10:24:34 PM
class Solution {
    public static boolean isPrime(int n)
    {
        if(n==0 || n==1)
        {
            return false;
        }
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }
    public int maximumPrimeDifference(int[] nums) {
        int a=-1;
        int b=-1;
        for(int i=0;i<nums.length;i++)
        {
            if(isPrime(nums[i])){
                a=i;
                break;
            }
        }
        for(int i=nums.length-1;i>=0;i--)
        {
            if(isPrime(nums[i])){
                b=i;
                break;
            }
        }
        return b-a;
    }
}