// Last updated: 9/4/2025, 12:31:59 PM
class Solution {
    public static int cc(String s,String t,int i,int j,int dp[][])
    {
        if(j==t.length())
        {
            return 1;
        }
        if(i==s.length())
        {
            return 0;
        }
        if(dp[i][j]!=-1)
        {
            return dp[i][j];
        }
        int inc=0,exc=0;
        if(s.charAt(i)==t.charAt(j)) {
            inc=cc(s,t,i+1,j+1,dp);
        }
        exc=cc(s,t,i+1,j,dp);
        return dp[i][j]=inc+exc;
    }
    public int numDistinct(String s, String t) {
        int dp[][]=new int[s.length()][t.length()];
        for(int a[]:dp) {
            Arrays.fill(a,-1);
        }
        return cc(s,t,0,0,dp);
    }
}