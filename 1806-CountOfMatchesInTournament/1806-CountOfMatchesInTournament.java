// Last updated: 8/23/2025, 10:26:37 PM
class Solution {
    public int numberOfMatches(int n) {
        int ans=0;
        while(n!=1)
        {
            ans+=n/2;
            n=n-n/2;
        }
        return ans;
    }
}