// Last updated: 12/15/2025, 12:00:51 PM
1class Solution {
2    public String longestWord(String[] words) {
3        Arrays.sort(words);
4        HashSet<String>hs=new HashSet<>();
5        String ans="";
6        for(String s:words)
7        {
8            int n=s.length();
9            if(s.length() ==1 || hs.contains(s.substring(0,n-1))) {
10                hs.add(s);
11                if(s.length()>ans.length()) ans=s;
12            }
13        }
14        return ans;
15    }
16}