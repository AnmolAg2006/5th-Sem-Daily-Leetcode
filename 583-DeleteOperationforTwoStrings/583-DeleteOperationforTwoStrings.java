// Last updated: 10/15/2025, 2:59:30 PM
class Solution {
    public static int fun(String s1,String s2,int i,int j,int dp[][])
    {
        if(i==s1.length()) return s2.length()-j;
        if(j==s2.length()) return s1.length()-i;
        if(dp[i][j]!=-1) return dp[i][j];
        if(s1.charAt(i)==s2.charAt(j))
        {
            return dp[i][j]= fun(s1,s2,i+1,j+1,dp);
        }
        return dp[i][j]= 1+Math.min(fun(s1,s2,i+1,j,dp),fun(s1,s2,i,j+1,dp));
    }
    public int minDistance(String word1, String word2) {
        int dp[][]=new int[word1.length()][word2.length()];
        for(int i[]:dp)
        {
            Arrays.fill(i,-1);
        }
        return fun(word1,word2,0,0,dp);
    }
}