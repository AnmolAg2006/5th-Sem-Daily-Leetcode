// Last updated: 12/12/2025, 10:12:08 PM
1class Solution {
2    public int minimumSum(int n, int k) {
3        HashSet<Integer>hs=new HashSet<>();
4        int ans=0;
5        int i=1;
6        while(n>0)
7        {
8            if(!hs.contains(k-i))
9            {
10                ans+=i;
11                hs.add(i);
12                n--;
13            }
14            i++;
15        }
16        return ans;
17    }
18}