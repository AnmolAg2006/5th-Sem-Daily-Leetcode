// Last updated: 9/10/2025, 12:21:40 PM
class Solution {
    public static int fun(int matrix[][],int i,int j,int dp[][])
    {
        if(j==matrix[0].length || j==-1)
        {
            return Integer.MAX_VALUE;
        }
        if(i==matrix.length-1)
        {
            return matrix[i][j];
        }

        if(dp[i][j]!=-11111) return dp[i][j];
        return dp[i][j]=matrix[i][j]+Math.min(Math.min(fun(matrix,i+1,j,dp),fun(matrix,i+1,j-1,dp)),fun(matrix,i+1,j+1,dp));
    }
    public int minFallingPathSum(int[][] matrix) {
        int dp[][]=new int[matrix.length][matrix[0].length];
        int ans=Integer.MAX_VALUE;
        for(int i[]:dp)
        {
            Arrays.fill(i,-11111);
        }
        for(int i=0;i<dp[0].length;i++)
        {
            ans=Math.min(ans,fun(matrix,0,i,dp));
        }
        return ans;
    }
}