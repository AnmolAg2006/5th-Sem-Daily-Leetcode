// Last updated: 9/10/2025, 12:38:06 PM
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
        int ans=Integer.MAX_VALUE;
        if(dp[i][j]!=-11111) return dp[i][j];
        for(int c=0;c<matrix.length;c++)
        {
            if(j==c)
            {
                continue;
            }
            ans=Math.min(ans,fun(matrix,i+1,c,dp));
        }
        return dp[i][j]=ans+matrix[i][j];
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