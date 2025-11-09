// Last updated: 11/9/2025, 8:52:46 AM
class Solution {
    public  int dfs(int grid[][],int i,int j,int k,Integer[][][]memo)
    {
        if(i>=grid.length || j>=grid[0].length ||  k<0) {
            return -1;
        }
        int cost=(i==0 && j==0)?0:gc(grid[i][j]);
        if(k-cost<0) return -1;
        if(i==grid.length-1 && j==grid[0].length-1) return grid[i][j];
        if(memo[i][j][k]!=null) return memo[i][j][k];
        int score=grid[i][j];
        int ms=-1;
        int r=dfs(grid,i,j+1,k-cost,memo);
        if(r!=-1) ms=Math.max(ms,score+r);
        int d=dfs(grid,i+1,j,k-cost,memo);
        if(d!=-1) ms=Math.max(ms,score+d);
        memo[i][j][k]=ms;
        return ms;
    }
    public int gc(int c)
    {
        return c==0?0:1;
    }
    public int maxPathScore(int[][] grid, int k) {
        int m=grid.length;
        int n=grid[0].length;
        Integer[][][]memo=new Integer[m][n][k+1];
        int res=dfs(grid,0,0,k,memo);
        return res==-1?-1:res;
        }
}