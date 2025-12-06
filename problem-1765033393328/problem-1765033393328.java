// Last updated: 12/6/2025, 8:33:13 PM
1class Solution {
2    public long maxPoints(int[] t1, int[] t2, int k) {
3        int n=t1.length;
4        int d[][]=new int[n][3];
5        for(int i=0;i<n;i++)
6        {
7            d[i][0]=t1[i];
8            d[i][1]=t2[i];
9            d[i][2]=t1[i]-t2[i];
10        }
11        Arrays.sort(d,(a,b)->b[2]-a[2]);
12        long ans=0;
13        int i=0;
14        while(i<k)
15        {
16            ans+=d[i++][0];
17            System.out.println(ans);
18        }
19        while(i<n)
20        {
21            ans+=Math.max(d[i][0],d[i][1]);
22            i++;
23        }
24        return ans;
25    }
26}