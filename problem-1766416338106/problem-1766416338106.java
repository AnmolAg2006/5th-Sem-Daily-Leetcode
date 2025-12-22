// Last updated: 12/22/2025, 8:42:18 PM
1class Solution {
2    public int halveArray(int[] nums) {
3        PriorityQueue<Double>pq=new PriorityQueue<>(Collections.reverseOrder());
4        double sum=0;
5        for(int i:nums)
6        {
7            sum+=i;
8            pq.add((double)i);
9        }
10        double c=0;
11        int co=0;
12        while(c<sum/2)
13        {
14            co++;
15            double curr=pq.poll();
16            c+=curr/2;
17            pq.add(curr/2);
18        }
19        System.out.print(pq);
20        return co;
21
22    }
23}