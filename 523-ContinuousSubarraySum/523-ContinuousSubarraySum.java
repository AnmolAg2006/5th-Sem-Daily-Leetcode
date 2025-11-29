// Last updated: 11/29/2025, 2:10:05 PM
1import java.util.*;
2
3class Solution {
4    public boolean checkSubarraySum(int[] nums, int k) {
5        // handle k == 0: need at least two consecutive zeros
6        if (k == 0) {
7            for (int i = 1; i < nums.length; i++) {
8                if (nums[i] == 0 && nums[i-1] == 0) return true;
9            }
10            return false;
11        }
12
13        Map<Integer, Integer> map = new HashMap<>();
14        map.put(0, -1); 
15        int rem = 0;
16        for (int i = 0; i < nums.length; i++) {
17            rem = (rem + nums[i]) % k;
18
19            if (map.containsKey(rem)) {
20                int prevIndex = map.get(rem);
21                if (i - prevIndex > 1) return true; 
22            } else {
23                map.put(rem, i); 
24            }
25        }
26        return false;
27    }
28}
29