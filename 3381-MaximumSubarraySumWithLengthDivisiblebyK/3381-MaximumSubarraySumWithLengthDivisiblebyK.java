// Last updated: 11/27/2025, 10:29:12 PM
1class Solution {
2    public long maxSubarraySum(int[] nums, int k) {
3        long ps[]=new long[nums.length+1];
4        for(int i=0;i<nums.length;i++)
5        {
6            ps[i+1]=ps[i]+nums[i];
7        }
8        long ans=Long.MIN_VALUE;
9        long b[]=new long[k];
10        Arrays.fill(b,Long.MAX_VALUE);
11        for(int j=0;j<=nums.length;j++)
12        {
13            int rem=j%k;
14            if(b[rem]!=Long.MAX_VALUE)
15            {
16                ans=Math.max(ans,ps[j]-b[rem]);
17            }
18            b[rem]=Math.min(b[rem],ps[j]);
19        }
20        
21        return ans;
22    }
23}