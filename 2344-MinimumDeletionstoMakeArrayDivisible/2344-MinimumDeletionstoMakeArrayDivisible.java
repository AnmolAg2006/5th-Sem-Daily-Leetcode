// Last updated: 11/29/2025, 3:38:19 PM
1class Solution {
2    public static int gcd(int a,int b)
3    {
4        return b == 0 ? a : gcd(b, a % b);
5    }
6    public int minOperations(int[] nums, int[] numsDivide) {
7        Arrays.sort(nums);
8        int num=numsDivide[0];
9        for(int i=1;i<numsDivide.length;i++)
10        {
11            num=gcd(num,numsDivide[i]);
12        }
13        for(int i=0;i<nums.length;i++)
14        {
15            if(num%nums[i] ==0 )return i;
16        }
17        return -1;
18    }
19}