// Last updated: 12/20/2025, 12:00:37 PM
1class Solution {
2    public int minDeletionSize(String[] strs) {
3        int n = strs.length;
4        int ans=0;
5        for (int j = 0; j < strs[0].length(); j++) {
6            for (int i = 0; i < n-1; i++) {
7                if(strs[i+1].charAt(j)<strs[i].charAt(j)) {
8                    ans++;
9                    break;
10                }
11            }
12        }
13        return ans;
14    }
15}