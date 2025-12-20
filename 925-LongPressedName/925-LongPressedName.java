// Last updated: 12/20/2025, 6:01:19 PM
1class Solution {
2    public boolean isLongPressedName(String name, String typed) {
3        int i=0;
4        int j=0;
5        while(i<name.length() && j<typed.length())
6        {
7            if(name.charAt(i)==typed.charAt(j))
8            {
9                int c1=0,c2=0;
10                while(i<name.length()-1 && name.charAt(i)==name.charAt(i+1))
11                {
12                    c1++;
13                    i++;
14                }
15                while(j<typed.length()-1 && typed.charAt(j)==typed.charAt(j+1))
16                {
17                    c2++;
18                    j++;
19                }
20                if(c1>c2) return false;
21            } else{
22                return false;
23            }
24            i++;
25            j++;
26        }
27        return i==name.length() && j==typed.length();
28    }
29}