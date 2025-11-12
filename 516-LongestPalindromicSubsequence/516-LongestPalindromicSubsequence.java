// Last updated: 11/12/2025, 10:05:02 AM
class Solution {
    public static int fun(String s,int i,int j,int dp[][])
    {
        if(i>j) return 0;
        if(i==j) return 1;
        if(dp[i][j]!=-1) return dp[i][j]; 
        if(s.charAt(i)==s.charAt(j)) return dp[i][j]= 2+fun(s,i+1,j-1,dp);
        return dp[i][j]= Math.max(fun(s,i,j-1,dp),fun(s,i+1,j,dp));
    }
    public int longestPalindromeSubseq(String s) {
        int dp[][]=new int[s.length()][s.length()];
        for(int i[]:dp) {
            Arrays.fill(i,-1);
        }
        return fun(s,0,s.length()-1,dp);
    }
}