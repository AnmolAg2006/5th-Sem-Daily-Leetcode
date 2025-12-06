// Last updated: 12/6/2025, 3:13:08 PM
1class Solution {
2    public int minMoves(int target, int md) {
3        int c=0;
4        while(target!=1 && md>0) {
5            if(target%2!=0)
6            {
7                target--;
8            } else {
9                target/=2;
10                md--;
11            }
12            c++;
13        }
14        return target-1+c;
15    }
16}