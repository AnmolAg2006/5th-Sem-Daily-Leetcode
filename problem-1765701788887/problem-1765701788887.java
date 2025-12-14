// Last updated: 12/14/2025, 2:13:08 PM
1class Solution {
2    public int absDifference(int[] nums, int k) {
3        int n=nums.length;
4        Arrays.sort(nums);
5        int ans=0;
6        for(int i=0;i<k;i++)
7            {
8                ans-=nums[i];
9            }
10        for(int i=n-k;i<n;i++)
11            {
12                ans+=nums[i];
13            }
14        return ans;
15    }
16}