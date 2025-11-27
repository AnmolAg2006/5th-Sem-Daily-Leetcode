// Last updated: 11/27/2025, 10:46:40 PM
1class Solution {
2    public long dividePlayers(int[] skill) {
3        Arrays.sort(skill);
4        int req=skill[skill.length-1]+skill[0];
5        long ans=skill[skill.length-1]*skill[0];
6        for(int i=1;i<skill.length/2;i++)
7        {
8            if(skill[skill.length-i-1]+skill[i]!=req) return -1;
9            ans+=skill[skill.length-i-1]*skill[i];
10        }
11        return ans;
12    }
13}