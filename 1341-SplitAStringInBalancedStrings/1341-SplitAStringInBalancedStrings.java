// Last updated: 8/23/2025, 10:27:25 PM
class Solution {
    public int balancedStringSplit(String s) {
        int ans=0;
        int c=0;
        for(char ch:s.toCharArray())
        {
            if(ch=='L')
            {
                c++;
            }
            else{
                c--;
            }
            if(c==0)
            {
                ans++;
            }
        }
        return ans;
    }
}