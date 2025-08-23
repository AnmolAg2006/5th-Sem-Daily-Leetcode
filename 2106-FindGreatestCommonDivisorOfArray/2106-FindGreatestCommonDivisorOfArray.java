// Last updated: 8/23/2025, 10:26:10 PM
class Solution {
    public static int gcd(int a,int b)
    {
        for(int i=Math.min(a,b);i>=0;i--)
        {
            if(a%i==0 && b%i==0)
            {
                return i;
            }
        }
        return -1;
    }
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        return gcd(nums[0],nums[nums.length-1]);
    }
}