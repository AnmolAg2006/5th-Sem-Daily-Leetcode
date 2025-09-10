// Last updated: 9/10/2025, 11:48:09 AM
class Solution {
    
    public int fun(int grid[][],int i,int j,int dp[][])
    {
        if(i==grid.length-1 && j==grid[0].length-1)
        {
            return grid[i][j];
        }
        if (i >= grid.length || j >= grid[0].length) {
            return Integer.MAX_VALUE;
        }
        if(dp[i][j]!=-1)
        {
            return dp[i][j];
        }
        int right=fun(grid,i,j+1,dp);
        int bottom=fun(grid,i+1,j,dp);
        return dp[i][j]=Math.min(right,bottom)+grid[i][j];
    }
    public int minPathSum(int[][] grid) {
        int dp[][]=new int [grid.length][grid[0].length];
        for(int i[]:dp)
        {
            Arrays.fill(i,-1);
        }
        return fun(grid,0,0,dp);
    }
}