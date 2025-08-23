// Last updated: 8/23/2025, 10:23:50 PM
class Solution {
    public int reverseDegree(String s) {
        int ans=0;
        int i=0;
        for(char c:s.toCharArray())
        {
            ans+=('z'-c+1)*++i;
        }
        return ans;
    }
}