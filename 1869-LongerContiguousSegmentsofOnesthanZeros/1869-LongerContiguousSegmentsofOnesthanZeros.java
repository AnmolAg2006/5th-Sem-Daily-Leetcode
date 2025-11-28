// Last updated: 11/28/2025, 11:14:36 PM
1class Solution {
2    public boolean checkZeroOnes(String s) {
3        int c1=0;
4        int c2=0;
5        int m1=0;
6        int m2=0;
7        for(char c:s.toCharArray())
8        {
9            if(c=='1')
10            {
11                c1++;
12                m1=Math.max(c1,m1);
13                c2=0;
14            } else {
15                c2++;
16                m2=Math.max(c2,m2);
17                c1=0;
18            }
19        }
20        return m1>m2;
21    }
22}