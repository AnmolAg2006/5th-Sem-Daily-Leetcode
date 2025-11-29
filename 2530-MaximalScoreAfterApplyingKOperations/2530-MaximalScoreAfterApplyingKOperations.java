// Last updated: 11/29/2025, 3:49:38 PM
1class Solution {
2    public long maxKelements(int[] nums, int k) {
3        PriorityQueue<Integer>pq=new PriorityQueue<>(Collections.reverseOrder());
4        for(int i:nums) pq.add(i);
5        long ans=0;
6        for(int i=0;i<k;i++)
7        {
8            int temp=pq.poll();
9            ans+=temp;
10            pq.add((temp + 2) / 3);
11        }
12        return ans;
13    }
14}