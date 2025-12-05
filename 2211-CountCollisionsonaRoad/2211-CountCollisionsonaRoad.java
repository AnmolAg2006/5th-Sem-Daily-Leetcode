// Last updated: 12/5/2025, 12:09:27 PM
1class Solution {
2    public int countCollisions(String directions) {
3        int n=directions.length();
4        int l=0;
5        while(l<n&& directions.charAt(l)=='L'){
6            l++;
7        }
8        int r=n-1;
9        while(r>=0 &&directions.charAt(r)=='R'){
10            r--;
11        }
12        int ans=0;
13        for(int i=l;i<=r;i++)
14        {
15            if(directions.charAt(i)!='S' )
16            {
17                ans++;
18            }
19
20        }
21        return ans;
22    }
23}