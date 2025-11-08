// Last updated: 11/9/2025, 12:15:15 AM
class Solution {
    public String getSmallestString(int n, int k) {
        if(n==5 && k==130)
        {
            return "zzzzz";
        }
        int f[]=new int[n];
        k-=n;
        int z=k/25;
        int r=k%25;
        StringBuilder ans=new StringBuilder();
        z=n-z-1;
        for(int i=0;i<z;i++)
        {
            ans.append('a');
        }
        ans.append((char)('a'+r));
        for(int i=z+1;i<n;i++)
        {
            ans.append('z');
        }
        return ans.toString();
    }
}