// Last updated: 8/23/2025, 10:26:46 PM
class Solution {
    public int maxDepth(String s) {
        int c=0;
        int ans=0;
        for(char ch:s.toCharArray())
        {
            if(ch=='(')
            {
                c++;
            }
            else if(ch==')')
            {
                c--;
            }
            ans=Math.max(c,ans);
        }
        return ans;
    }
}