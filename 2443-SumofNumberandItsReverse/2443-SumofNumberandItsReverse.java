// Last updated: 12/20/2025, 11:03:28 PM
1class Solution {
2    public static int rev(int n)
3    {
4        int ans=0;
5        while(n!=0)
6        {
7            ans=ans*10+n%10;
8            n/=10;
9        }
10        return ans;
11    }
12    public boolean sumOfNumberAndReverse(int num) {
13        for(int i=num/2;i<=num;i++)
14        {
15            if(i+rev(i)==num) return true;
16        }
17        return false;
18    }
19}