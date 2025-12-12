// Last updated: 12/12/2025, 8:46:34 PM
1class Solution {
2    public int longestSubarray(int[] nums) {
3        int max=0;
4        int c=0;
5        int ans=0;
6        for (int num : nums) {
7            if (num > max) {
8                max = num;
9            }
10        }
11        for(int i=0;i<nums.length;i++)
12        {
13            int curr=nums[i];
14                if(max==curr){
15                    c++;
16                    ans=Math.max(ans,c);
17                }else  {
18                    c=0;
19                } 
20            
21        }
22        return ans;
23    }
24}