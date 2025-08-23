// Last updated: 8/23/2025, 10:24:41 PM
class Solution {
    public long minimumSteps(String s) {
        long c=0,ans=0;
        for(int i=s.length()-1;i>=0;i--)
        {
            if(s.charAt(i)=='0')
            {
                c++;
            }
            else{
                ans+=c;
            }
        }
        return ans;
    }
}