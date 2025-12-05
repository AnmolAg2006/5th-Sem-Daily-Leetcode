// Last updated: 12/5/2025, 11:33:57 AM
1class Solution {
2    public int countPartitions(int[] nums) {
3        int n=nums.length;
4        int ps[]=new int[n+1];
5        for(int i=1;i<=n;i++)
6        {
7            ps[i]=ps[i-1]+nums[i-1];
8        }
9        int ans=0;
10        
11        for(int i=1;i<n;i++)
12        {
13            if((ps[n])%2==0) ans++;
14        }
15        return ans;
16    }
17}