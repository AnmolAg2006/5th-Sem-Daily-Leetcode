// Last updated: 12/21/2025, 11:01:56 PM
1class Solution {
2    public boolean canArrange(int[] arr, int k) {
3        int[] freq = new int[k];
4
5        for (int num : arr) {
6            int remainder = ((num % k) + k) % k; 
7            freq[remainder]++;
8        }
9
10        for (int i = 1; i < k; i++) {
11            if (freq[i] != freq[k - i]) {
12                return false;
13            }
14        }
15
16        if (freq[0] % 2 != 0) {
17            return false;
18        }
19
20        return true;
21    }
22}