// Last updated: 12/21/2025, 8:15:46 PM
1class Solution {
2    public int leastBricks(List<List<Integer>> wall) {
3        HashMap<Integer, Integer> hm = new HashMap<>();
4        int t=0;
5        for(int i:wall.get(0))
6        {
7            t+=i;
8        }
9        for (int i=0;i<wall.size();i++) {
10            List<Integer> temp = wall.get(i);
11            int sum = 0;
12            for (int j :temp) {
13                sum+=j;
14                hm.put(sum,hm.getOrDefault(sum,0)+1);
15            }
16        }
17        int ans=wall.size();
18        for(int i:hm.keySet())
19        {
20            if(i!=t)
21            {
22
23            ans=Math.min(ans,wall.size()-hm.get(i));
24            }
25        }
26        System.out.print(hm);
27        return ans;
28    }
29}