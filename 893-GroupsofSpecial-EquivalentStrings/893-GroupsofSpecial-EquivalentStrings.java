// Last updated: 11/29/2025, 5:59:26 PM
1import java.util.*;
2
3class Solution {
4    public int numSpecialEquivGroups(String[] words) {
5        Set<String> set = new HashSet<>();
6        for (String w : words) {
7            int[] e = new int[26], o = new int[26];
8            for (int i = 0; i < w.length(); i++) {
9                char c = w.charAt(i);
10                if ((i & 1) == 0) e[c - 'a']++;
11                else o[c - 'a']++;
12            }
13            StringBuilder sb = new StringBuilder(60);
14            for (int x : e) { sb.append(x).append('#'); }
15            sb.append('|');
16            for (int x : o) { sb.append(x).append('#'); }
17            set.add(sb.toString());
18        }
19        return set.size();
20    }
21}
22