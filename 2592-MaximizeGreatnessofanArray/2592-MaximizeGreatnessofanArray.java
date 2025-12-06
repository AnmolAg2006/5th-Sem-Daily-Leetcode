// Last updated: 12/6/2025, 5:43:38 PM
1class Solution {
2    public int maximizeGreatness(int[] nums) {
3        Arrays.sort(nums);
4        int ans=0;
5        for(int i:nums)
6        {
7            if(nums[ans]<i)
8            {
9                ans++;
10            }
11        }
12        return ans;
13    }
14}