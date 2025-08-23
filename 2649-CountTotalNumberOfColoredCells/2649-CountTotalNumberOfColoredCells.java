// Last updated: 8/23/2025, 10:25:17 PM
class Solution {
    public long coloredCells(int n) {
        long ans=1;
        for(int i=1;i<n;i++)
        {
            ans+=4*i;
        }
        return ans;
    }
}