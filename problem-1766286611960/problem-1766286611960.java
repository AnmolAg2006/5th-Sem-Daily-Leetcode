// Last updated: 12/21/2025, 8:40:11 AM
1import java.util.*;
2
3class Solution {
4    public int minSwaps(int[] nums, int[] forbidden) {
5        int n = nums.length;
6
7        Map<Integer, Integer> freq = new HashMap<>();
8        Map<Integer, Integer> restrict = new HashMap<>();
9
10        for (int x : nums)
11            freq.put(x, freq.getOrDefault(x, 0) + 1);
12
13        for (int x : forbidden)
14            restrict.put(x, restrict.getOrDefault(x, 0) + 1);
15
16        for (Map.Entry<Integer, Integer> e : freq.entrySet()) {
17            int key = e.getKey(), val = e.getValue();
18            if (val > n - restrict.getOrDefault(key, 0)) return -1;
19        }
20
21        int collisions = 0, maxCollisionFreq = 0;
22        Map<Integer, Integer> collisionCounts = new HashMap<>();
23
24        for (int i = 0; i < n; i++) {
25            if (nums[i] == forbidden[i]) {
26                collisions++;
27                int c = collisionCounts.getOrDefault(nums[i], 0) + 1;
28                collisionCounts.put(nums[i], c);
29                maxCollisionFreq = Math.max(maxCollisionFreq, c);
30            }
31        }
32
33        if (collisions == 0) return 0;
34
35        int halfCeil = (collisions + 1) >> 1;
36        return Math.max(maxCollisionFreq, halfCeil);
37    }
38}
39