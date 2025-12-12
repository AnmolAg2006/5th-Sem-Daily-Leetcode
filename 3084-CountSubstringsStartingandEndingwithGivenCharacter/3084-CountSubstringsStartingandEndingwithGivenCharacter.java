// Last updated: 12/12/2025, 10:40:08 PM
1class Solution {
2    public long countSubstrings(String s, char c) {
3        int co=0;
4        long ans=0;
5        for(char ch:s.toCharArray())
6        {
7            if(ch==c) {
8                co++;
9            ans+=co;
10            }
11        }
12        return ans;
13    }
14}