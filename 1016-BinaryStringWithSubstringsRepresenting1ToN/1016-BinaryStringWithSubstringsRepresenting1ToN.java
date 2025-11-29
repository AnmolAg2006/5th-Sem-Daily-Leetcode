// Last updated: 11/29/2025, 6:15:51 PM
1class Solution {
2    public boolean queryString(String s, int n) {
3        for(int i=1;i<=n;i++)
4        {
5            if(s.indexOf(Integer.toBinaryString(i))==-1) return false;
6        }
7        return true;
8    }
9}