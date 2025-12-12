// Last updated: 12/12/2025, 6:52:56 PM
1class Solution {
2    public boolean winnerOfGame(String colors) {
3        int c1=0;
4        int c2=0;
5        for(int i=1;i<colors.length()-1;i++)
6        {
7            if(colors.charAt(i-1)=='A' && colors.charAt(i)=='A' && colors.charAt(i+1)=='A'){
8                c1++;
9            }
10            else if(colors.charAt(i-1)=='B' && colors.charAt(i)=='B' && colors.charAt(i+1)=='B'){
11                c2++;
12            }
13        }
14        return c1>c2;
15    }
16}