// Last updated: 12/21/2025, 10:16:16 PM
1class Solution {
2    public boolean isPossibleDivide(int[] nums, int k) {
3        if (nums.length % k != 0) {
4            return false;
5        }
6
7        Map<Integer, Integer> map = new HashMap<>();
8        for (int num : nums) {
9            map.put(num, map.getOrDefault(num, 0) + 1);
10        }
11
12        Arrays.sort(nums);
13
14        for (int num : nums) {
15            if (map.get(num) > 0) {
16                for (int i = num + 1; i < num + k; i++) {
17                    if (map.getOrDefault(i, 0) == 0) {
18                        return false;
19                    }
20                    map.put(i, map.get(i) - 1);
21                }
22                map.put(num, map.get(num) - 1);
23            }
24        }
25
26        return true;
27    }
28}