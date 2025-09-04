// Last updated: 9/4/2025, 10:48:24 AM
class Solution {
    public static int max(String t1,String t2,int n,int m,int dp[][]) {
        int i=n;
        int j=m;
        if(n==t1.length()|| m==t2.length())
        {
            return 0;
        }
        if(dp[i][j]!=-1) return dp[i][j];
        if(t1.charAt(n)==t2.charAt(m)) {
            return dp[i][j]=1+max(t1,t2,n+1,m+1,dp);
        } else {
            return dp[i][j]=Math.max(max(t1,t2,n,m+1,dp),max(t1,t2,n+1,m,dp));
        }
    }
    public int longestCommonSubsequence(String text1, String text2) {
        int dp[][]=new int[text1.length()][text2.length()];
        for(int i=0;i<dp.length;i++)
        {
            Arrays.fill(dp[i],-1);
        }
        return max(text1,text2,0,0,dp);
    }
}