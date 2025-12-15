// Last updated: 12/15/2025, 10:28:43 AM
1class Solution {
2    public long getDescentPeriods(int[] prices) {
3        int n=prices.length;
4        long ans=1;
5        int c=1;
6        for (int i = 1; i < n; i++) {
7            if (prices[i] == prices[i-1] - 1) c++;
8            else c = 1;
9            ans += c;
10        }
11        return ans;
12    }
13}