// Last updated: 9/22/2025, 9:44:01 PM
class Solution {
    public static int fun(String s,int i,int j,int dp[][])
    {
        if(i>=j )
        {
            return 0;
        }
        if(dp[i][j]!=-1) return dp[i][j];
        if(s.charAt(i)==s.charAt(j))
        {
            return dp[i][j]= fun(s,i+1,j-1,dp);
        }
        else {
            return dp[i][j]= Math.min(fun(s,i+1,j,dp),fun(s,i,j-1,dp))+1;
        }
    }
    public int minInsertions(String s) {
        int dp[][]=new int[s.length()+1][s.length()+1];
        for(int i[]:dp)
        {
            Arrays.fill(i,-1);
        }
        return fun(s,0,s.length()-1,dp);
    }
}