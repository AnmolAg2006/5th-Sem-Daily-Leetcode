// Last updated: 11/30/2025, 8:13:57 AM
1class Solution {
2    public int maxDistinct(String s) {
3        HashSet<Character>hs=new HashSet<>();
4        for(char c:s.toCharArray())
5            {
6                hs.add(c);
7            }
8        return hs.size();
9    }
10}