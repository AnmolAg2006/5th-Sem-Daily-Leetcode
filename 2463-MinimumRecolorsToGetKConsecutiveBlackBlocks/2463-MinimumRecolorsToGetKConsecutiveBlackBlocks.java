// Last updated: 8/23/2025, 10:25:32 PM
class Solution {
    public int minimumRecolors(String blocks, int k) {
        int c=0;
        for(int i=0;i<k;i++)
        {
            if(blocks.charAt(i)=='W')
            {
                c++;
            }
        }
        int ans=c;
        for(int i=k;i<blocks.length();i++)
        {
            if(blocks.charAt(i)=='W')
            {
                c++;
            }
            if(blocks.charAt(i-k)=='W')
            {
                c--;
            }
            ans=Math.min(ans,c);
        }
        return ans;
    }
}