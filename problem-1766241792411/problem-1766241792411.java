// Last updated: 12/20/2025, 8:13:12 PM
1class Solution {
2    public int minOperations(int[] nums) {
3        int ans=0;
4        int idx=-1;
5        HashSet<Integer>hs=new HashSet<>();
6        for(int i=nums.length-1;i>=0;i--)
7            {
8                if(hs.contains(nums[i]))
9                {
10                    idx=i;
11                    break;
12                }
13                hs.add(nums[i]);
14            }
15        if(idx==-1) return 0;
16        else return  (int)Math.floor((idx)/3)+1;
17    }
18}