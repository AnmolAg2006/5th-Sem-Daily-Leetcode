// Last updated: 11/29/2025, 5:27:02 PM
1class Solution {
2    public static boolean isPossible(String s,String p)
3    {
4        if(s.length()!=p.length()) return false;
5        for(int i=0;i<s.length();i++)
6        {
7            if(s.indexOf(s.charAt(i))!=p.indexOf(p.charAt(i)))
8            {
9                return false;
10            }
11        }
12        return true;
13    }
14    public List<String> findAndReplacePattern(String[] words, String pattern) {
15        List<String> ans=new ArrayList<>();
16        for(String word:words) 
17        {
18            if(isPossible(word,pattern))
19            {
20                ans.add(word);
21            }
22        }
23        return ans;
24    }
25}