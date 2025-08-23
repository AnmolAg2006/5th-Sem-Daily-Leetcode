// Last updated: 8/23/2025, 10:24:22 PM
class Solution {
    public int minimumLength(String s) {
        int c[]=new int[26];
        int n=s.length();
        for(int i=0;i<n;i++)
        {
            c[s.charAt(i)-97]++;
        }
        int ans=0;
        for(int i=0;i<26;i++)
        {
            while(c[i]>=3)
            {
                ans+=2;
                c[i]-=2;
            }
        }
        return n-ans;
    }
}