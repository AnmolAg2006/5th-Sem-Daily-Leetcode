// Last updated: 10/6/2025, 1:43:55 PM
class Solution {
    public static boolean dfs(int[][] grid,int t,int i,int j,boolean vis[][])
    {
        int n=grid.length;
        if(i>=n||i<0 || j>=n || j<0 || vis[i][j] || grid[i][j]>t)
        {
            return false;
        }
        vis[i][j]=true;
        if(i==n-1 && j==n-1) return true;
        return dfs(grid,t,i+1,j,vis)||dfs(grid,t,i,j+1,vis)||dfs(grid,t,i-1,j,vis)||dfs(grid,t,i,j-1,vis);
    }
    public int swimInWater(int[][] grid) {
        int n=grid.length;
        int lo=grid[0][0];
        int hi=n*n-1;
        int i=0,j=0;
        while(lo<hi)
        {
            int mid=(lo+hi)/2;
            if(dfs(grid,mid,i,j,new boolean [n][n]))
            {
                hi=mid;
            } else {
                lo=mid+1;
            }
        }
        return hi;
    }
}