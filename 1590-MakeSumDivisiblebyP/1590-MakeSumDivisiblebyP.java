// Last updated: 11/30/2025, 9:22:42 AM
1class Solution {
2    public int minSubarray(int[] nums, int p) {
3        int n=nums.length;
4        int rem[]=new int[n+1];
5        for(int i=1;i<=n;i++)
6        {
7            rem[i]=(rem[i-1]+nums[i-1])%p;
8        }
9        if(rem[n]==0) return 0;
10        HashMap<Integer,Integer>hm=new HashMap<>();
11        hm.put(0, 0);
12        int ans = n;
13        for(int i=1;i<rem.length;i++)
14        {
15            int req=rem[i]-rem[n];
16            if(req<0) req+=p;
17            if(hm.containsKey(req)){
18                ans = Math.min(ans, i - hm.get(req));
19            }
20            hm.put(rem[i],i);
21        }
22        return ans == n ? -1 : ans;
23    }
24}