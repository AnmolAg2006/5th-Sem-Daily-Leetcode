// Last updated: 12/8/2025, 7:40:52 PM
1class Solution {
2    public static boolean fun(int a,int b,int n) {
3        double sum=Math.pow(a,2)+Math.pow(b,2);
4        double sq=Math.sqrt(sum);
5        if(sq==(int)sq && sq<=n) return true; 
6        return false;
7    }
8    public int countTriples(int n) {
9        int ans=0;
10        for(int i=1;i<n;i++)
11        {
12            for(int j=i+1;j<=n;j++)
13            {
14                if(fun(i,j,n)) ans+=2;
15            }
16        }
17        return ans;
18    }
19}