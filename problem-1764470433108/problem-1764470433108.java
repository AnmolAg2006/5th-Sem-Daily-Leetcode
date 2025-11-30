// Last updated: 11/30/2025, 8:10:33 AM
1class Solution {
2    public int countElements(int[] nums, int k) {
3        // Arrays.sort(nums);
4        int n=nums.length;
5        if(k==0) return n;
6        Arrays.sort(nums);
7        int t=nums[n-k];
8        int ans=0;
9        for(int i:nums)
10            {
11                if(i<t) ans++;
12                else break;
13            }
14        return ans;
15    }
16}