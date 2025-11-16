// Last updated: 11/16/2025, 6:13:16 PM
class Solution {
    static int MOD=1000000007;
    public int numSub(String s) {
        long ans=0;
        long c=0;
        for(char ch:s.toCharArray())
        {
            if(ch=='1')
            {
                c++;
                // ans+=c;
            } else {
                ans+=(c*(c+1)/2);
                c=0;
            }
        }
        return (int)((ans+c*(c+1)/2)%MOD);
    }
}