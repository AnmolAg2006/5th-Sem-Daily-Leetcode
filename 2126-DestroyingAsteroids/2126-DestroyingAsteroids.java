// Last updated: 12/6/2025, 3:05:40 PM
1class Solution {
2    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
3        Arrays.sort(asteroids);
4        long masss=mass;
5        for(int i=0;i<asteroids.length;i++)
6        {
7            if(asteroids[i]>masss)
8            {
9                return false;
10            }
11            masss+=asteroids[i];
12
13        }
14        return true;
15    }
16}