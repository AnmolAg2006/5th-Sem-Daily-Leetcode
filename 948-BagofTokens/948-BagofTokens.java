// Last updated: 12/6/2025, 1:33:33 PM
1class Solution {
2    public int bagOfTokensScore(int[] tokens, int power) {
3        Arrays.sort(tokens);
4        int lo = 0;
5        int hi = tokens.length - 1;
6        int s=0;
7        int ms=0;
8        while (lo <= hi) {
9            if (tokens[lo] <= power) {
10                power-=tokens[lo];
11                s++;
12                ms=Math.max(ms,s);
13                lo++;
14            } else if(s>=1) {
15                    power+=tokens[hi];
16                    hi--;
17                    s--;
18                } 
19                
20            else{
21                break;
22            }
23        }
24        return ms;
25    }
26}