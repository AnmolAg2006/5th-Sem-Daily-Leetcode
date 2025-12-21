// Last updated: 12/21/2025, 8:01:46 AM
1class Solution {
2    public int mirrorDistance(int n) {
3        int n1=n;
4        int temp=0;
5        while(n!=0)
6            {
7                temp=temp*10+n%10;
8                n/=10;
9                
10            }
11        return Math.abs(n1-temp);
12    }
13}