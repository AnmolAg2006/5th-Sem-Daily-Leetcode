// Last updated: 12/21/2025, 8:08:15 AM
1class Solution {
2    public long minCost(String s, int[] cost) {
3        long total=0;
4        long t[]=new long[26];
5        int j=0;
6        for(char c:s.toCharArray())
7            {
8                total+=cost[j];
9                t[c-'a']+=cost[j++];
10                
11            }
12        long ans=Long.MAX_VALUE;
13        for(int i=0;i<26;i++)
14            {
15                if(t[i]>0)
16                {
17                    ans=Math.min(ans,total-t[i]);
18                }
19            }
20        return ans;
21        
22    }
23}