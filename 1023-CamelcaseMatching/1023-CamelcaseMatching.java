// Last updated: 11/29/2025, 7:43:18 PM
1class Solution {
2    public static boolean fun(String s, String pattern) {
3        int j = 0;
4        for (int i = 0; i < s.length(); i++) {
5            char c = s.charAt(i);
6            if (c == pattern.charAt(j)) {
7                j++;
8
9                if (j == pattern.length()) {
10                    i++;
11                    for (; i < s.length(); i++) {
12                        if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
13                            return false;
14                        }
15                    }
16                    return true;
17                } 
18            }else if(c>='A' && c<='Z') return false;
19        }
20        return false;
21    }
22
23    public List<Boolean> camelMatch(String[] queries, String pattern) {
24        List<Boolean> ans = new ArrayList<>();
25        for (String s : queries) {
26            ans.add(fun(s, pattern));
27        }
28        return ans;
29    }
30}