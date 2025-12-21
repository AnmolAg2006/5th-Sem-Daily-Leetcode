// Last updated: 12/21/2025, 10:17:24 PM
1class Solution {
2    public boolean isNStraightHand(int[] hand, int groupSize) {
3        int nums[]=hand;
4        int k=groupSize;
5        if (nums.length % k != 0) {
6            return false;
7        }
8
9        Map<Integer, Integer> map = new HashMap<>();
10        for (int num : nums) {
11            map.put(num, map.getOrDefault(num, 0) + 1);
12        }
13
14        Arrays.sort(nums);
15
16        for (int num : nums) {
17            if (map.get(num) > 0) {
18                for (int i = num + 1; i < num + k; i++) {
19                    if (map.getOrDefault(i, 0) == 0) {
20                        return false;
21                    }
22                    map.put(i, map.get(i) - 1);
23                }
24                map.put(num, map.get(num) - 1);
25            }
26        }
27
28        return true;
29    }
30}