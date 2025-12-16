// Last updated: 12/16/2025, 5:32:38 PM
1class Solution {
2    public int findPairs(int[] nums, int k) {
3        int n=nums.length;
4        Arrays.sort(nums);
5        int i=0;
6        int j=1;
7        int ans=0;
8        while(j<n)
9        {
10            if(nums[j]-nums[i]<k)
11            {
12                j++;
13            } else if(nums[j]-nums[i]>k)
14            {
15                i++;
16                if(i==j) j++;
17            } else {
18                i++;
19                j++;
20                ans++;
21                while(j<n && nums[j]==nums[j-1]) j++;
22            }
23        }
24        return ans;
25    }
26}